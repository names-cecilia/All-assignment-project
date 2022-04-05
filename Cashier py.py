#fuction
def disc():
    if totalPrice >100:
        print("\nYou just purchase more than $100!")
        print("You've got discount 15%! Now your total is $" + str(totalPrice*0.85))
        print("\nTHANK YOU!")
    else :
        print("THANK YOU!")

print("    BOOKSTORE CASHIER")
print("=======================\n")

#array
books = ["Children book", "Parenting book", "Educational book", "Science book", "Novel"]
price = [20, 40, 30, 45, 35]

#looping
for i in range (0, 5):
    print(str(books[i]) + " : $" + str(price[i]))

print("\nDISCOUT 15% IF PURCHASE MORE THAN $100")
print("----------------------------------------\n")

item = int(input("Input book item number [0 to 4] : "))

#conditional
if (item>=0 and item<=4) :
    n = int(input("How many book : "))
    name = books[item]
    totalPrice = price[item]*n
    print("------------------------")
    print("You just bought " + str(n) + " book(s) of " + str(name))
    print("for $" + str(totalPrice))
    disc();
else :
    print("\nPlease enter the number between 0 to 4")


