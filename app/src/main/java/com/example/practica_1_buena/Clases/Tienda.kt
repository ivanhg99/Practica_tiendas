package com.example.practica_1_buena.Clases

data class Tienda(
        var nombre:String,
        var descripcion:String


) {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Tienda

                if (nombre != other.nombre) return false
                if (descripcion != other.descripcion) return false

                return true
        }

        override fun hashCode(): Int {
                var result = nombre.hashCode()
                result = 31 * result + descripcion.hashCode()
                return result
        }
}