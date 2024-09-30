#TokenWithKey:top#
#TokenWithKey:import#

# <token_key>TokenWithKey ::= <TOKEN_KEY> <TOKEN_NAME>
class TokenWithKey(Token_key): #TokenWithKey:class#

    className = "TokenWithKey"
    ruleString = "<token_key>TokenWithKey ::= <TOKEN_KEY> <TOKEN_NAME>"
    token_key = None
    token_name = None

    def __init__(token_key, token_name):
        #TokenWithKey:init#
        self.token_key = token_key
        self.token_name = token_name

#TokenWithKey#
