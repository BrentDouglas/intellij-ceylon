Float total {
variable Float sum := 0.0;
for (LineItem li in lineItems) {
sum += li.amount;
}
return sum;
}
---
value name {
return Name(firstName, initial, lastName);
}
---
String name { return join(firstName, lastName); }