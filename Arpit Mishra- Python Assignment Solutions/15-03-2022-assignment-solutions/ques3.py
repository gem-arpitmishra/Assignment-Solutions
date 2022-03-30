# assignment 3
tup1 = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
print("Input 3 numbers space seperated: ")
a, b, c = map(int, input().split())
t1 = (a, b, c)

print("Before adding values: ", tup1)

tup1 += t1

print("After adding values: ", tup1)
