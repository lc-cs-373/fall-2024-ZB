#TokenNoKey:top#
#TokenNoKey:import#

# <token_key>TokenNoKey ::= <TOKEN_NAME>
class TokenNoKey(Token_key): #TokenNoKey:class#

    className = "TokenNoKey"
    ruleString = "<token_key>TokenNoKey ::= <TOKEN_NAME>"
    token_name = None

    def __init__(token_name):
        #TokenNoKey:init#
        self.token_name = token_name

#TokenNoKey#
