import hashlib

msg = "Pratik"
result = hashlib.md5(msg.encode())

print("The md5 output is :  ", end=" ")

print(result.hexdigest())