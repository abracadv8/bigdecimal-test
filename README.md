# bigdecimal-test

Example of converting a really large string representation to big BigDecimal
takes somewhere near linear time with respect to the size of the exponent.


### Converting from really long strings to a BigDecimal, then back to a long

- As per a 10_000_000 loop to create
- As per a 10_000_000 loop to longval

```
BigDecimal instantiation from a string of length [8]: 
 diffNS[1735725]  diffMS[1]
BigDecimal instantiation longval: 
 diffNS[5258]  diffMS[0]
BigDecimal: 1.00E7

BigDecimal instantiation from a string of length [80]: 
 diffNS[64950]  diffMS[0]
BigDecimal instantiation longval: 
 diffNS[13609]  diffMS[0]
BigDecimal: 1.00E79

BigDecimal instantiation from a string of length [800]: 
 diffNS[689404]  diffMS[0]
BigDecimal instantiation longval: 
 diffNS[2165]  diffMS[0]
BigDecimal: 1.00E799

BigDecimal instantiation from a string of length [8000]: 
 diffNS[9912682]  diffMS[9]
BigDecimal instantiation longval: 
 diffNS[4021]  diffMS[0]
BigDecimal: 1.00E7999

BigDecimal instantiation from a string of length [72800]: 
 diffNS[124239152]  diffMS[124]
BigDecimal instantiation longval: 
 diffNS[3093]  diffMS[0]
BigDecimal: 1.00E72799

BigDecimal instantiation from a string of length [728000]: 
 diffNS[9271215922]  diffMS[9271]
BigDecimal instantiation longval: 
 diffNS[11134]  diffMS[0]
BigDecimal: 1.00E727999
```


### Converting a scientific notation string to a BigDecimal, then back to a long

- As per a 10_000_000 loop to create
- As per a 10_000_000 loop to longval

```
BigDecimal instantiation from: [1.00E999]
 diffNS[47939]  diffMS[0]
BigDecimal instantiation longval: 
 diffNS[111034]  diffMS[0]
BigDecimal: 1.00E999

BigDecimal instantiation from: [1.00E7999]
 diffNS[4639]  diffMS[0]
BigDecimal instantiation longval: 
 diffNS[251760]  diffMS[0]
BigDecimal: 1.00E7999

BigDecimal instantiation from: [1.00E97999]
 diffNS[5567]  diffMS[0]
BigDecimal instantiation longval: 
 diffNS[6387107]  diffMS[6]
BigDecimal: 1.00E97999

BigDecimal instantiation from: [1000000000e10000000]
 diffNS[71755]  diffMS[0]
BigDecimal instantiation longval: 
 diffNS[6233543092]  diffMS[6233]
BigDecimal: 1.00E10000009

```


