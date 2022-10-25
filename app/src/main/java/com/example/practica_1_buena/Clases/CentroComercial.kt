package com.example.practica_1_buena.Clases

data class CentroComercial(
        var nombre:String,
        var direccion:String,
        var numeroti:String,
        var listatiendas:MutableList<Tienda>

) {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as CentroComercial

                if (nombre != other.nombre) return false
                if (direccion != other.direccion) return false
                if (numeroti != other.numeroti) return false
                if (listatiendas != other.listatiendas) return false

                return true
        }

        override fun hashCode(): Int {
                var result = nombre.hashCode()
                result = 31 * result + direccion.hashCode()
                result = 31 * result + numeroti.hashCode()
                result = 31 * result + listatiendas.hashCode()
                return result
        }
}

