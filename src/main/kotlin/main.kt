fun main() {
//     1: Kiểu dữ liệu
//     Kiểu số:
//     var : Từ khoá khai báo
//     number : Tên của biến
//     phép gán
//     Int -> số nguyên số không có phần thập phân
//     comment code -> Chương trình không chạy qua
//    var number: Int = 10
//    var number1: Float = 10.1f
//    var number2: Number = 10
//    var name: String = "Pham Tan phat"
//    var isMale: Boolean = true

//     Khai báo thông tin
//     tên, địa chỉ, sở thích
//    2: Toán tử -> + - x /
//    Toán hạng: chính là các số (giá trị)
//    Biểu thức: => đoạn xử lý mà có giá trị trả về
//    var number1: Int = 5
//    var number2: Int = 10
//     Cộng
//     var total: Int = number1 + number2
//     Chia: 5 / 10 = 0
//     phương thức chuyển đổi kiểu dữ liệu: toFloat, toString..
//    var total = number1.toFloat() / number2.toFloat()
//    print(total)

// Bài tập: Siêu thị bán đồ giảm giá, tổng bill sẽ được giảm 20%
//    var totalPrice = 1_051_000
    // solution -> đưa ra trước
//    var total = totalPrice * 0.8

// Bài tập: Tính bmi
//    Chỉ số cơ thể: cân năng / chiều cao x chiều cao
//    var number = 5
//    number = number + 1
//    number += 1

    // Trường hợp value++
    // Có 2 biểu thức
    // 1 -> Gán giá trị trước
    // 2 -> Tăng giá trị lên 1
//    var number = 5
//    var number2 = 10
//
//    var total = number++ - --number2 + --number + number2++
    // Độ ưu tiên ++, -- lớn nhất
    // 5 - --number2 + --number + number2++, number = 6, number2 = 10
    // 5 - 9 + --number + number2++, number = 6, number2 = 9
    // 5 - 9 + 5 + number2++, number = 5, number2 = 9
    // 5 - 9 + 5 + 9, number = 5, number2 = 10
    // total = 10, number = 5, number2 = 10
//    println(total)
//    println(number)
//    println(number2)
}