import socket 

mysock = socket.socket(socket.AF_INET, socket.SOCK_STREAM) # Make a Socket(Phone call) 
mysock.connect(('data.pr4e.org', 80)) # Dial the number of the server(Dialing the number)

cmd = 'GET http://data.pr4e.org/romeo.txt HTTP/1.0\r\n\r\n'.encode() 
mysock.send(cmd) # Send the request to the server

while True:
    data = mysock.recv(512) # Receive the data from the server
    if len(data) < 1:
        break
    print(data.decode(),end='')
mysock.close() #end the call 