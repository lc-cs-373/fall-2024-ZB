#RuleTok:top#
#RuleTok:import#

# <rule>RuleTok ::= <token_key> <IDENTIFIER>
class RuleTok(Rule): #RuleTok:class#

    className = "RuleTok"
    ruleString = "<rule>RuleTok ::= <token_key> <IDENTIFIER>"
    token_key = None
    identifier = None

    def __init__(token_key, identifier):
        #RuleTok:init#
        self.token_key = token_key
        self.identifier = identifier

#RuleTok#
