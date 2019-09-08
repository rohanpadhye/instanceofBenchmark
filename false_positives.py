import matplotlib
matplotlib.rcParams['pdf.fonttype'] = 42
matplotlib.rcParams['ps.fonttype'] = 42

import matplotlib.pyplot as plt
import math
import numpy as np
from itertools import cycle


def fp(m, k, n):
	return np.power(1 - np.exp(-k * n / m), k)


n=np.arange(30)+1


lines = cycle(["-C0","--C1","-.C2",":C3","-C4","--C5"])

plt.title("False Positive Rate for 64-bit bloom filter")
plt.xlabel("Number of transitive supertypes")
plt.ylabel("Probability of false positives")
for k in [1, 2, 3, 4, 5]:
	p=fp(64, k, n)
	plt.plot(n, p, next(lines), lw=1+k/4, label="k="+str(k))
plt.legend()

#plt.show()
plt.savefig("fp.pdf")

#print(fp(m=64, k=32, n=10))