# question 11
# json to csv conversion
json1 = '{"ID":{"0":90,"1":56,"2":34,"3":96,"4":45},"Name":{"0":"Akash","1":"Chalsea","2":"Divya","3":"Sajal","4":"Shubham"},"Marks":{"0":81,"1":87,"2":100,"3":89,"4":78},"Grade":{"0":"B","1":"B","2":"A","3":"B","4":"C"}}'
f = open("file1.json",'w')
f.write(json1)
f.close()
json2 = '{"ID":{"0":23,"1":43,"2":12,"3":13,"4":67,"5":89},"Name":{"0":"Ram","1":"Deep","2":"Yash","3":"Aman","4":"Arjun","5":"Aditya"},"Marks":{"0":89,"1":97,"2":45,"3":78,"4":56,"5":76},"Grade":{"0":"B","1":"A","2":"F","3":"C","4":"E","5":"C"}}' 
f = open('file2.json','w')
f.write(json2)
f.close()
import pandas as pd
df1 = pd.read_json (r"./file1.json")
print(df1.head())
df1.to_csv("file1_file2.csv")
df_csv1 = pd.read_csv("file1_file2.csv")
print(df_csv1.head())
df2 = pd.read_json (r"./file2.json")
df2.to_csv('file1_file2.csv', mode='a', index=True, header=False)
df_csv2 = pd.read_csv("file1_file2.csv")
print(df_csv2.head())