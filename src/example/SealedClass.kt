package example

sealed class NetworkResult {
    data class Succes(val data: String) : NetworkResult()
    data class Error(val message: String, val code: Int) : NetworkResult()
    object Loading : NetworkResult()
}
fun handleResult(result: NetworkResult) {
    when (result) {
        is NetworkResult.Succes -> {
            println("Успех: ${result.data}")
        }
        is NetworkResult.Error -> {
            println("Ошибка ${result.code}: ${result.message}")
        }

        NetworkResult.Loading -> {
            println("Загрузка...")
        }
    }
}
fun main() {
    val success = NetworkResult.Succes("Данные получены")
    val error = NetworkResult.Error("Сервер не отвечает", 500)
    val loading = NetworkResult.Loading
    handleResult(success)
    handleResult(error)
    handleResult(loading)
}