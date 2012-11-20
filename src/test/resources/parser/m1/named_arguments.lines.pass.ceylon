{
product = getProduct(id);
quantity = 1;
}
---
{
description = "Total";
Float amount {
variable Float total := 0.0;
for (Item item in items) {
sum += item.amount;
}
return total;
}
}
---
{
Head head { title="Hello"; }
Body body {
Div { "Hello " name "!" }
}
}
---
{
object iterator
satisfies Iterator<Order> {
head = order;
tail = null;
}
}
---
{
label = "Say Hello";
void onClick() {
say("Hello");
}
}
---
{
Comparison by(Value x, Value y) {
return x<=>y;
}
}
---
{
function by(Value x, Value y) {
return x<=>y;
}
}