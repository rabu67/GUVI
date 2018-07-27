d=['a','e','i','o','u','A','E','I','O','U'];
s=str(input("Enter the letter:"))
x=['~','!','@','#','$','%','^','&','*'];
if(s in d):
  print("vowel")
elif(s in x):
    print("invalid")
else:
  print("consonant")
