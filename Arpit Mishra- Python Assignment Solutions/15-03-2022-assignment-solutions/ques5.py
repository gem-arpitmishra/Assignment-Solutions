# assignment 5
x = {1: 2, 3: 4, 4: 3, 2: 1, 0: 0}
print("Before Sorting: ", x)
x1 = {k: v for k, v in sorted(x.items(), key=lambda item: item[1])}
print("After Sorting(Ascending): ", x1)
x2 = {k: v for k, v in sorted(
    x.items(), key=lambda item: item[1], reverse=True)}
print("After Sorting(Descending): ", x2)
