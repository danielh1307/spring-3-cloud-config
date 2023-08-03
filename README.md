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

Das file-configmap.yaml kann er auch lesen, aber nur wenn es via:
```
      envFrom:
        - configMapRef:
            name: file-config-my-app
```
in den Pod eingebunden ist. Als file gemounted ging es nicht, auch nicht als 2. application.properties.

=========

This version works with the Secret, but it is injected as env variable into the Pod.