# bigdecimal-test

Example of converting a really large string representation to big BigDecimal
takes somewhere near linear time with respect to the size of the exponent.



```
"C:\Pr............................t\production\bigdecimal-test" TestHarnessBigDecimal
BigDecimal superBig1 instantiation:  start[3435299753494645]  finish[3435299755079746]  diffNS[1585101]  diffMS[1]
BigDecimal: 1.00E7

BigDecimal superBig10 instantiation:  start[3435299755936474]  finish[3435299755995239]  diffNS[58765]  diffMS[0]
BigDecimal: 1.00E79

BigDecimal superBig100 instantiation:  start[3435299756594021]  finish[3435299757601372]  diffNS[1007351]  diffMS[1]
BigDecimal: 1.00E799

BigDecimal superBig1000 instantiation:  start[3435299759057191]  finish[3435299769434733]  diffNS[10377542]  diffMS[10]
BigDecimal: 1.00E7999

BigDecimal superBig10000 instantiation:  start[3435299796683937]  finish[3435299893676358]  diffNS[96992421]  diffMS[96]
BigDecimal: 1.00E72799

BigDecimal superBig100000 instantiation:  start[3435300022377608]  finish[3435309302988465]  diffNS[9280610857]  diffMS[9280]
BigDecimal: 1.00E727999

Process finished with exit code 0
```


