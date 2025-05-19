public class Provincia {
        private String nombre;
        private Pais pais;

        public Provincia(String nombre, Pais pais) {
            this.nombre = nombre;
            this.pais = pais;
        }

        @Override
        public String toString() {
            return "Provicia{" +
                    "nombre='" + nombre + '\'' +
                    ", pais=" + pais +
                    '}';
        }

}
