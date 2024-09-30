#Tok:top#
#Tok:import#

# <rule>Tok ::= <token_key> IDENTIFIER
class Tok(Rule): #Tok:class#

    className = "Tok"
    ruleString = "<rule>Tok ::= <token_key> IDENTIFIER"
    token_key = None

    def __init__(token_key):
        #Tok:init#
        self.token_key = token_key

#Tok#
