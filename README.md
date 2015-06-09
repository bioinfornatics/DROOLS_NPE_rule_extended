# DROOLS bug

bug report: https://issues.jboss.org/browse/DROOLS-809

## the stacktrace

```
Exception in thread "main" Exception executing consequence for rule "extended" in fr.cea.test: java.lang.NullPointerException
at org.drools.core.runtime.rule.impl.DefaultConsequenceExceptionHandler.handleException(DefaultConsequenceExceptionHandler.java:39)
at org.drools.core.common.DefaultAgenda.fireActivation(DefaultAgenda.java:1125)
at org.drools.core.phreak.RuleExecutor.fire(RuleExecutor.java:160)
at org.drools.core.phreak.RuleExecutor.evaluateNetworkAndFire(RuleExecutor.java:108)
at org.drools.core.common.DefaultAgenda.fireNextItem(DefaultAgenda.java:1016)
at org.drools.core.common.DefaultAgenda.fireAllRules(DefaultAgenda.java:1302)
at org.drools.core.impl.StatefulKnowledgeSessionImpl.fireAllRules(StatefulKnowledgeSessionImpl.java:1289)
at org.drools.core.impl.StatefulKnowledgeSessionImpl.fireAllRules(StatefulKnowledgeSessionImpl.java:1262)
at fr.cea.test.App.main(App.java:57)
Caused by: java.lang.NullPointerException
at fr.cea.test.Rule_extended1921345119DefaultConsequenceInvokerGenerated.evaluate(Unknown Source)
at fr.cea.test.Rule_extended1921345119DefaultConsequenceInvoker.evaluate(Unknown Source)
at org.drools.core.common.DefaultAgenda.fireActivation(DefaultAgenda.java:1114)
... 7 more
```


This occur when using "or", "exists" and "extends"

This project provides a minimal test case to reproduce the bug

In this [test case](https://github.com/bioinfornatics/DROOLS_NPE_rule_extended/blob/master/src/main/resources/fr.cea.test/rules.drl) :
- if we comment line number [35](https://github.com/bioinfornatics/DROOLS_NPE_rule_extended/blob/master/src/main/resources/fr.cea.test/rules.drl#L35) , any error are raised
- if we uncomment line number [10](https://github.com/bioinfornatics/DROOLS_NPE_rule_extended/blob/master/src/main/resources/fr.cea.test/rules.drl#L10) , any error are raised
- if we remove all "exists" words, any error are raised

If the same rule is write using named consequence the test pass.
