log.info("Hello world!")
---
log.info { message = "Hello world!"; }
---
printer.print { join = ", "; "Gavin", "Emmanuel", "Max", "Steve" }
---
printer.print { "Names: ", from (Person p in people) select (p.name) }
---
hash(default, firstName, initial, lastName)
---
hash { algorithm=default; firstName, initial, lastName }
---
perform {
    as = subject;
        void action() {
        exec("java Hello");
    }
}
---
check {
    FilePermission {
        path = "/usr/bin";
        action = read | execute;
    }
}