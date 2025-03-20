import hashlib

msg = "Pratik"
result = hashlib.sha256(msg.encode())

print("The sha256 output is :  ", end=" ")

print(result.hexdigest())