# RetoAutomatizacionSophos
Reto de Automatización Web
Primero que todo les comento que el código de este repositorio corresponde a una automatización de procesos web.
Está hecha bajo el patrón de screenplay y el lenguaje de programación Java, utilicé un gherkin para plasmar o describir mi historia de usuario y sus respectivos escenarios, también utilicé cucumber para que transforme mi gherkin en lenguaje java.
Realicé una task para abrir el navegador y una para todas interacciones que tiene el robot con la web site. 
Utilicé una question donde verifico que el producto que agregue al carrito de compra si era el selecionado anteriormente. 
La capa model me ayuda a inicializar los objetos que luego necesitaré para decirle al robot que articulo quiero buscar en la web site.
Los mapeos los hice en la capa de las userinterfaces.
En la capa de util tengo dos clases, una llamada constante donde grabo una par de variables que utilizaré en otras clases con el fin de no pasarles datos "quemados" a mi código ya que estos son conocido como malas practicas.
Todo el código esta dividido por capas y clases para así respetar los principios SOLID, mas especificamente el de abierto cerrado.