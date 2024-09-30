#TokenKey:top#
#TokenKey:import#

# <token_key>TokenKey ::= <TOKEN_KEY> <TOKEN_NAME>
class TokenKey(Token_key): #TokenKey:class#

    className = "TokenKey"
    ruleString = "<token_key>TokenKey ::= <TOKEN_KEY> <TOKEN_NAME>"
    token_key = None
    token_name = None

    def __init__(token_key, token_name):
        #TokenKey:init#
        self.token_key = token_key
        self.token_name = token_name

#TokenKey#
