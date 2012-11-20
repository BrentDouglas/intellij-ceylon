Float amount {
    value Float total := 0.0;
    for (Item item in items) {
        sum += item.amount;
    }
    return total;
}
---

Head head { title="Hello"; }
---
Body body {
    Div { "Hello " name "!" }
}