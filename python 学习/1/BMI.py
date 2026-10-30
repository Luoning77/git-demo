A   =float(input("输入体重kg"))
B   =float(input("输入身高m"))
BMI =A/(B ** 2)
print("BMI=" + str(BMI))

if   BMI < 18.5:
    print("瘦了")
elif BMI< 25:
    print("正常")
elif BMI< 30:
    print("胖了")
else :
    print("很胖") 