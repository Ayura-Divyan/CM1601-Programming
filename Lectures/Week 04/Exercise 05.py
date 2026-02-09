num = 0
try:
    num = int(input("Enter the number of novels: "))
    if (num > 20):
        print("Wow!")
    elif (num == 0):
        print("Buy One Now!!")
    else:
        print("Not Bad")
except ValueError:
    print("Error: Invalid data type, please enter only numbers")

x = 7.0
y = 3.5

if (x/y) == 2.0:
    print ("True")
else:
    print ("False")