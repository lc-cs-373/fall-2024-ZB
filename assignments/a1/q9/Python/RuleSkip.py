#RuleSkip:top#
#RuleSkip:import#

# <rule>RuleSkip ::= <SKIP_KEYWORD> <TOKEN_NAME> <IDENTIFIER>
class RuleSkip(Rule): #RuleSkip:class#

    className = "RuleSkip"
    ruleString = "<rule>RuleSkip ::= <SKIP_KEYWORD> <TOKEN_NAME> <IDENTIFIER>"
    skip_keyword = None
    token_name = None
    identifier = None

    def __init__(skip_keyword, token_name, identifier):
        #RuleSkip:init#
        self.skip_keyword = skip_keyword
        self.token_name = token_name
        self.identifier = identifier

#RuleSkip#
