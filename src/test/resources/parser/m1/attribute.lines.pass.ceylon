something(getProduct(id), 1)
something"safdg"345'sdfg'`d`
something
doc "The user login action"
by "Gavin King" "Andrew Haley"
throws (DatabaseException, "if database access fails")
seeAlso (LogoutAction.logout)
scope (session)
action { description="Log In"; url="/login"; }
shared Float total {
variable Float sum := 0.0;
for (LineItem li in lineItems) {
sum += li.amount;
}
return sum;
}
---
something(getProduct(id), 1)
something"safdg"345'sdfg'`d`
something
doc "The user login action"
by "Gavin King" "Andrew Haley"
throws (DatabaseException, "if database access fails")
seeAlso (LogoutAction.logout)
scope (session)
action { description="Log In"; url="/login"; }
value name {
return Name(firstName, initial, lastName);
}
---
something(getProduct(id), 1)
something"safdg"345'sdfg'`d`
something
doc "The user login action"
by "Gavin King" "Andrew Haley"
throws (DatabaseException, "if database access fails")
seeAlso (LogoutAction.logout)
scope (session)
action { description="Log In"; url="/login"; }
shared String name { return join(firstName, lastName); }
---
something(getProduct(id), 1)
something"safdg"345'sdfg'`d`
something
doc "The user login action"
by "Gavin King" "Andrew Haley"
throws (DatabaseException, "if database access fails")
seeAlso (LogoutAction.logout)
scope (session)
action { description="Log In"; url="/login"; }
shared assign name { firstName := first(name); lastName := last(name); }