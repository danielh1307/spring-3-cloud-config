# Spring-3-cloud-config

In dieser Version kann er die Werte der configmap beide lesen und ausgeben. 
Sie sind beide nicht als File gemounted.

Die Configmap my-app erkennt er deshalb, weil sie so heisst wie die Applikation.

Die Configmap names-configmap erkennt er deshalb, weil wir sie explizit einbinden im Pod.
Wenn wir das nicht tun, also diesen Teil weglassen:
```yaml
      envFrom:
        - configMapRef:
            name: names-configmap
```
dann startet der Pod nicht einmal mehr.

Die Updates funktionieren allerdings nicht.

=====

