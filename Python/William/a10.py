import math
import random

def sel_sqrt(a,b):
    return [2*i if i % 2 == 0 else round(math.sqrt(i)*100)/100 for i in range(a,b+1)]

def inchtomtuple_lc(h_list):
    return [(x, round(0.0254*x * 10000)/10000) for x in h_list]

def inchtomtuple_map(h_list):
    return list(map(lambda x: (x, round(0.0254*x * 10000)/10000), h_list))

print(sel_sqrt(1,10))
h_list = [random.randint(30,90) for x in range(10)]
print(inchtomtuple_lc(h_list))
print(inchtomtuple_map(h_list))