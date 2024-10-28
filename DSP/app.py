from flask import Flask

app=Flask(__name__)
@app.route('/')
def home():
    return 'Hello , World !'
@app.route('/user/<username>')
def user_profile(username) :
    return f'User Profile : {username}'

if __name__ == '__main__' :
    app.run(debug=True)

