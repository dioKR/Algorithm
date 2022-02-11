from collections import Counter

a = [6,6,1,2,3,4,5,5,5]
b = Counter(a)
c = b.most_common(1)

print(b)
print(b.most_common(1))
print(f'value : {c[0][0]},{c[0][1]}')
print(b.keys())

for x,y in b.items():
    print(x,y)