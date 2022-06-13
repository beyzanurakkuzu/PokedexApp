package com.beyzaakkuzu.pokedexapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.random.Random


@Entity
@JsonClass(generateAdapter = true)
data class PokemonInfo(
    @Json(name="id") @PrimaryKey val id:Int,
    @Json(name="name") val name:String,
    @Json(name="height") val height:Int,
    @Json(name="weight") val weight:Int,
    @Json(name="base_experience") val experience: Int,
    @Json(name="types") val types:List<TypeResponse>,
    val hp:Int= Random.nextInt(maxHp),
    val attack:Int=Random.nextInt(maxAttack),
    val speed:Int=Random.nextInt(maxSpeed),
    val defense:Int=Random.nextInt(maxDefense),
    val exp:Int=Random.nextInt(maxExp)

) {

    companion object {
        const val maxHp = 300
        const val maxAttack = 300
        const val maxDefense = 300
        const val maxSpeed = 300
        const val maxExp = 1000
    }


    fun getId(): String = String.format("#%03d", id)
    fun getWeiht(): String = String.format("%.1f KG", weight.toFloat() / 10)
    fun getHeight(): String = String.format("%.1f M", height.toFloat() / 10)
    fun getHp(): String = "$hp/$maxHp"
    fun getAttack(): String = "$attack/$maxAttack"
    fun getSpeed(): String = "$speed/$maxSpeed"
    fun getDefense(): String = "$defense/$maxDefense"
    fun getExp(): String = "$exp/$maxExp"

    @JsonClass(generateAdapter = true)
    data class TypeResponse(
        @Json(name = "type") val type: Type
    )


    @JsonClass(generateAdapter = true)
    data class Type(@Json(name="name")val name:String)


}