# pt_DemoAutomation

Para ejecutar un test, lanzar la siguiente sentencia:

```
test -Denvironment=local_chrome -Dcucumber.features='src/test/resources/features/' -Dcucumber.filter.tags='@getNombreModeloAuto' -Dcucumber.plugin="json:target/site/result.json" -Dcucumber.glue='demo'
```