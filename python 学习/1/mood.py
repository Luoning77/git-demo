mood = int(input("情绪值:"))
hp   = int(input("精力值:"))
if mood >= 60 :
    if hp >= 60 :
        print ("可以")
    else: #hp < 60
        print("不可以")

else: #mood < 60
    print ("不可以")

if mood >= 90 and hp >= 90 :
    print("123")
