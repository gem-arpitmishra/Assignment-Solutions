# assignment 09 and 10
# program to read first 10 chars from a txt file
f = open("data.txt", 'r')
print(f.read(10))
f.close()
# program to give number of lines from a txt file
f = open("data.txt", "r")
print(len(f.readlines()))
f.close()
