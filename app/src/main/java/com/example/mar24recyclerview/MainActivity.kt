package com.example.mar24recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mar24recyclerview.adapter.TopicAdapter
import com.example.mar24recyclerview.model.Story
import com.example.mar24recyclerview.model.Topic

class MainActivity : AppCompatActivity() {
    private val story: Topic = Topic(
        "Truyện suy ngẫm", R.drawable.img_2, arrayListOf(
            Story(
                "Ông lão già làng",
                "Tại một làng nọ, có một ông lão. Ông ấy là một trong những người bất hạnh nhất thế giới. Cả làng đều phát ngán ông lão bởi vì ông ấy thường xuyên u sầu, liên tục oán trách và luôn ở trong trạng thái cáu kỉnh.\n" +
                        "\n" +
                        "Càng sống lâu, ông ấy càng trở nên cáu gắt và lời nói càng độc địa. Mọi người đều xa lánh ông lão, bởi vì sợ lây nhiễm sự bất hạnh của ông. Nếu có ai đó ở gần ông mà tỏ ra hạnh phúc thì cũng bị cho là quái đản.\n" +
                        "\n" +
                        "Ông lão khiến những người xung quanh cảm thấy bất hạnh.\n" +
                        "\n" +
                        "Nhưng một ngày nọ, khi ông tròn 80 tuổi, một điều khó tin đã xảy ra. Ngay lập tức, mọi người bắt đầu nghe được tin đồn: \"Hôm nay, ông lão rất là hạnh phúc, ông ấy không phàn nàn về bất cứ điều gì cả, chỉ cười thôi và thậm chí khuôn mặt của ông cũng tươi tỉnh lên hẳn\".\n" +
                        "\n" +
                        "Cả làng tụ tập lại và hỏi ông lão.\n" +
                        "\n" +
                        "Dân làng: Chuyện gì đã xảy ra với ông vậy?\n" +
                        "\n" +
                        "Ông lão: Không có gì đặc biệt cả. Trong 80 năm qua, tôi đã theo đuổi hạnh phúc mà chẳng được gì cả. Và rồi, tôi quyết định sẽ sống mà không cần hạnh phúc nữa, cứ thế mà tận hưởng cuộc sống thôi. Thế là bây giờ, tôi lại cực kỳ hạnh phúc."
            ),
            Story(
                "Người đàn ông thông thái",
                "Chuyện kể rằng mọi người thường hay tìm đến một người đàn ông thông thái, lúc nào họ cũng phàn nàn về những vấn đề tương tự. Một ngày nọ, ông ấy kể cho mọi người nghe một câu chuyện hài và mọi người cười ồ lên.\n" +
                        "\n" +
                        "Sau vài phút, ông ấy kể lại câu chuyện đó cho mọi người nghe lần nữa và chỉ có vài người trong số họ tiếp tục mỉm cười.\n" +
                        "\n" +
                        "Khi ông ấy kể lại câu chuyện đùa đó lần thứ ba thì không còn ai cười nữa.\n" +
                        "\n" +
                        "Người đàn ông thông thái mỉm cười và nói: \"Một câu chuyện đùa không thể khiến bạn cười nhiều lần. Vậy, tại sao bạn luôn khóc về cùng một vấn đề?\""

            ),
            Story(
                "Chú lừa ngốc nghếch",
                "Có một người bán muối thường chất bao muối lên lưng con lừa của anh ta để đem ra chợ bán mỗi ngày.\n" +
                        "\n" +
                        "Trên đường đi, họ phải băng qua một con suối. Một ngày nọ, con lừa bất ngờ ngã xuống dòng suối và thế là bao muối bị rơi xuống nước. Muối gặp nước bị hòa tan và do đó chiếc túi trở nên rất nhẹ. Chú lừa rất vui vì không phải vác nặng.\n" +
                        "\n" +
                        "Sau đó, mỗi ngày, chú lừa bắt đầu giở trò, giả bộ ngã xuống nước.\n" +
                        "\n" +
                        "Người bán muối rồi cũng phát hiện ra mánh khóe của chú lừa và quyết dạy cho nó một bài học. Hôm sau, anh ta chất một túi bông lên lưng chú lừa.\n" +
                        "\n" +
                        "Lần này, cũng vậy, chú lừa lại giở mánh khóe tương tự, hy vọng túi bông sẽ trở nên nhẹ hơn.\n" +
                        "\n" +
                        "Nhưng bông bị ẩm sẽ trở nên nặng hơn và thế là chú lừa đã tự chuốc khổ vào thân. Qua lần đó, nó rút ra được một bài học và kể từ đó về sau, chú lừa không dám giở trò nữa. Người bán muối lúc này rất vui vẻ."
            ),
            Story(
                "Người bạn tốt nhất\n" +
                        "\n",
                "Có một câu chuyện kể về hai người bạn đang băng qua sa mạc. Trong cuộc hành trình, có một số thời điểm hai người đã cãi vã nhau và thế là một người đã tát vào mặt người còn lại.\n" +
                        "\n" +
                        "Người bạn bị tát bị tổn thương nhưng không nói gì, chỉ viết trên cát: \"Hôm nay, người bạn thân nhất đã tát vào mặt tôi\".\n" +
                        "\n" +
                        "Hai người bạn tiếp tục cuộc hành trình đến khi tìm thấy một ốc đảo và họ quyết định sẽ ghé vào đấy để tắm rửa. Trong lúc tắm, người bạn bị tát bị mắc kẹt trong vũng bùn và có thể chết đuối, nhưng người bạn còn lại đã cứu anh ta. Sau khi hồi phục sau sự cố, anh ta đã viết lên hòn đá: \"Hôm nay, người bạn thân nhất đã cứu mạng tôi\".\n" +
                        "\n" +
                        "Người bạn đã ra tay tát bạn mình đồng thời cứu bạn mình đã hỏi người kia: \"Khi tôi tát anh thì anh viết trên cát, còn giờ tại sao anh lại viết trên đá?\"\n" +
                        "\n" +
                        "Người bạn kia trả lời: \"Khi bị ai đó làm tổn thương, chúng ta chỉ nên viết trên cát để những cơn gió có thể xóa nó đi. Nhưng khi được ai đó gia ân, chúng ta phải khắc vào đá để không một cơn gió nào có thể xóa đi được\"."
            ),
            Story(
                "Bốn chàng sinh viên lém lỉnh",
                "Một đêm nọ, bốn chàng sinh viên ra ngoài tiệc tùng mãi đến đêm mới về và do vậy, họ không thể chuẩn bị kịp cho bài kiểm tra ngày mai. Vào buổi sáng, họ đã nghĩ ra một kế hoạch.\n" +
                        "\n" +
                        "Họ dùng dầu mỡ và bụi bẩn tự làm bẩn bản thân.\n" +
                        "\n" +
                        "Sau đó, bốn chàng sinh viên đến gặp thầy trưởng khoa và nói rằng tối qua, họ đi tham dự một buổi tiệc đám cưới và trên đường về lốp xe của họ bị nổ, thế là họ phải đẩy xe suốt đoạn đường về nhà. Vì vậy, bốn người không kịp chuẩn bị để làm bài kiểm tra.\n" +
                        "\n" +
                        "Thầy trưởng khoa suy nghĩ trong một phút và nói rằng họ có thể kiểm tra lại sau 3 ngày nữa. Bốn chàng sinh viên cảm ơn ông ấy và nói rằng tới lúc đó, họ sẽ chuẩn bị tốt.\n" +
                        "\n" +
                        "Vào ngày thứ ba, bốn người xuất hiện trong văn phòng của thầy trưởng khoa. Thầy trưởng khoa nói rằng đây là bài kiểm tra đặc biệt, cả bốn người được yêu cầu phải ngồi trong các phòng riêng biệt để làm kiểm tra. Tất cả bốn người đều đồng ý vì họ đã chuẩn bị tốt trong 3 ngày qua.\n" +
                        "\n" +
                        "Bài kiểm tra chỉ bao gồm 2 câu hỏi với tổng số 100 điểm:\n" +
                        "\n" +
                        "1) Tên của bạn? __________ (1 điểm)\n" +
                        "\n" +
                        "2) Lốp xe nào bị nổ? __________ (99 điểm) \n" +
                        "\n" +
                        "(a) Bánh trước bên trái \n" +
                        "(b) Bánh trước bên phải\n" +
                        "(c) Bánh sau bên trái \n" +
                        "(d) Bánh sau bên phải"
            ),
            Story(
                "Chú sư tử tham lam",
                "Chuyện kể rằng vào một ngày trời cực kỳ nóng, có một chú sư tử đang rất đói bụng.\n" +
                        "\n" +
                        "Chú sư tử mới rời khỏi ổ và bắt đầu lùng sục khắp nơi. Những gì chú có thể tìm thấy chỉ là một con thỏ nhỏ. Chú sư tử bắt chú thỏ rừng với một chút do dự. Nó nghĩ rằng: \"Con thỏ này không thể khiến mình no bụng được\".\n" +
                        "\n" +
                        "Khi chú sư tử chuẩn bị giết chú thỏ rừng thì có một chú nai chạy ngang qua. Chú sư tử trở nên tham lam và nghĩ: \"Thay vì ăn con thỏ nhỏ xíu này, chi bằng chọn con nai lớn kia\".\n" +
                        "\n" +
                        "Chú sư tử thả con thỏ rừng đi và rượt theo chú nai. Nhưng chú nai đã biến mất hút vào trong khu rừng. Chú sư tử bấy giờ lại cảm thấy hối tiếc vì đã thả con thỏ rừng đi."
            ),
            Story(
                "Hai người bạn và con gấu",
                "Vijay và Raju là hai người bạn. Vào một kỳ nghỉ, họ cùng nhau đi bộ trong một khu rừng, tận hưởng vẻ đẹp của thiên nhiên. Đột nhiên, họ thấy một con gấu tiến đến. Cả hai bắt đầu trở nên sợ hãi.\n" +
                        "\n" +
                        "Raju, rất giỏi trèo cây, đã chạy đến một cái cây và nhanh chóng trèo lên. Anh không lo gì đến Vijay cả. Vijay thì lại không biết trèo cây.\n" +
                        "\n" +
                        "Vijay mới chợt lóe lên một ý tưởng. Anh nghe nói gấu không thích xác chết nên giả vờ ngã xuống đất và nín thở. Con gấu lại đánh hơi và nghĩ rằng anh ta đã chết, thế là nó bỏ đi.\n" +
                        "\n" +
                        "Raju hỏi Vijay: \"Con gấu đã thì thầm điều gì vào tai bạn thế?\"\n" +
                        "\n" +
                        "Vijay trả lời: \"Gấu khuyên tôi nên tránh xa những người bạn giống như anh\"... rồi cứ thế bước đi."
            ),
            Story(
                "Những khó khăn trong đời",
                "Ngày xửa ngày xưa, có một cô gái phàn nàn với cha rằng cuộc sống của cô thật khốn khổ và cô không biết làm thế nào sống cho nổi đây.\n" +
                        "\n" +
                        "Lúc nào, cô bé cũng cảm thấy mệt mỏi vì phải chiến đấu và vật lộn. Dường như khi một vấn đề được giải quyết thì vấn đề khác lại xuất hiện.\n" +
                        "\n" +
                        "Cha cô, là một đầu bếp, dẫn cô vào bếp. Ông ấy đổ đầy ba nồi nước và đem từng nồi nấu với lửa cao.\n" +
                        "\n" +
                        "Khi ba nồi nước bắt đầu sôi, người cha cho khoai tây vào nồi thứ nhất, trứng vào nồi thứ hai và hạt cà phê xay vào nồi thứ ba. Sau đó, ông chờ chúng được đun sôi mà không nói một lời nào với con gái.\n" +
                        "\n" +
                        "Cô con gái rên rỉ và sốt ruột chờ đợi, tự hỏi cha đang làm gì. Sau hai mươi phút, người cha tắt lửa.\n" +
                        "\n" +
                        "Ông lấy khoai tây ra khỏi nồi và đặt chúng vào một cái bát. Ông lấy trứng ra và đặt chúng vào một cái bát khác. Sau đó, ông ta múc cà phê ra cho vào cốc.\n" +
                        "\n" +
                        "Quay sang cô, người cha hỏi: \"Con gái, con nhìn thấy điều gì?\"\n" +
                        "\n" +
                        "\"Khoai tây, trứng và cà phê\", cô vội vàng trả lời.\n" +
                        "\n" +
                        "\"Hãy nhìn kỹ hơn\", ông nói \"và chạm vào khoai tây\". Cô con gái làm theo và để ý thấy chúng rất mềm.\n" +
                        "\n" +
                        "Sau đó, người cha yêu cầu cô gái lấy một quả trứng rồi tách vỏ ra. Sau khi tách vỏ, cô quan sát quả trứng được luộc chín.\n" +
                        "\n" +
                        "Cuối cùng, ông bảo cô gái hãy nhấp một ngụm cà phê. Hương thơm của nó đã mang lại nụ cười trên khuôn mặt cô.\n" +
                        "\n" +
                        "“Cha à, điều này có nghĩa là gì vậy?”, cô hỏi.\n" +
                        "\n" +
                        "Sau đó, người cha mới giải thích rằng khoai tây, trứng và hạt cà phê đều từng đối mặt với cùng một nghịch cảnh, là nước sôi. Tuy nhiên, mỗi thứ lại phản ứng theo cách khác nhau. Khoai tây vốn cứng và chắc, nhưng khi cho vào nước sôi, nó trở nên mềm và yếu.\n" +
                        "\n" +
                        "Trứng rất dễ vỡ, cần lớp vỏ mỏng bên ngoài để bảo vệ phần dung dịch bên trong. Sau khi được luộc chín, phần bên trong mới trở nên cứng cáp.\n" +
                        "\n" +
                        "Tuy nhiên, hạt cà phê xay là thứ độc đáo nhất. Sau khi tiếp xúc với nước sôi, chúng đã thay đổi nước và tạo nên một thứ cực kỳ mới mẻ.\n" +
                        "\n" +
                        "\"Vậy con là thứ nào đây?\" Người cha hỏi con gái.\n" +
                        "\n" +
                        "\"Khi nghịch cảnh gõ cửa nhà con, con sẽ phản ứng thế nào? Con sẽ là khoai tây, quả trứng, hay là cà phê?\""
            ),
            Story(
                "Con cáo và chùm nho",
                "Một buổi chiều nọ, có một chú cáo đang dạo bước trong rừng và chú phát hiện ra một chùm nho treo lơ lửng trên cành cây cao.\n" +
                        "\n" +
                        "\"Thứ này sẽ làm dịu cơn khát của mình đây\", chú nghĩ.\n" +
                        "\n" +
                        "Lùi lại vài bước, chú cáo phóng người lên nhưng lại chụp không trúng chùm nho. Một lần nữa, chú cáo lại lùi lại vài bước và cố gắng để chụp trúng chùm nho nhưng vẫn thất bại.\n" +
                        "\n" +
                        "Cuối cùng, bỏ cuộc, chú cáo hếch mũi lên và nói: \"Dù gì thì cũng chỉ là những trái nho chua mà thôi\", rồi cứ thế bỏ đi."
            ),
            Story(
                "Con sư tử và người nô lệ nghèo",
                "Chuyện kể về một người nô lệ, bị chủ đối xử tàn tệ, đang chạy trốn vào rừng. Trong khu rừng, anh ta bắt gặp một con sư tử đang đau đớn vì bị một cái gai đâm vào chân. Người nô lệ dũng cảm tiến lên và nhẹ nhàng gỡ bỏ cái gai đi.\n" +
                        "\n" +
                        "Nhổ xong, con sư tử bỏ đi mà không làm tổn hại gì đến anh ấy hết.\n" +
                        "\n" +
                        "Vài ngày sau đó, chủ nhân của người nô lệ vào rừng đi săn. Ông ta bắt được rất nhiều con thú rồi nhốt chúng vào lồng. Những người tùy tùng của ông ấy phát hiện ra người nô lệ và thế là chúng giải anh ấy đến gặp người chủ độc ác.\n" +
                        "\n" +
                        "Người chủ mới ra lệnh ném người nô lệ vào chuồng sư tử.\n" +
                        "\n" +
                        "Người nô lệ đang chờ đợi cái chết thì bỗng nhiên, anh ta nhận ra đó chính là con sư tử mà anh từng giúp đỡ. Con sư tử không ăn thịt anh ta. Lúc này, người nô lệ mới giải cứu cho con sư tử và tất cả các con vật khác bị nhốt trong lồng rồi trốn thoát."
            )

        )
    )
    private val jokes: Topic = Topic(
        "Truyện cười", R.drawable.img_1, arrayListOf(
            Story(
                "Thì thầm",
                "Đang giờ lễ trong nhà thờ, bé trai ngồi bên cạnh mẹ nó bỗng nói lớn:\n" +
                        "\n" +
                        "– Mẹ ơi! Con muốn… tè.\n" +
                        "\n" +
                        "Bà mẹ kéo con ra ngoài cho nó giải quyết rồi dặn:\n" +
                        "\n" +
                        "– Lần sau con không được nói “tè” trong nhà thờ như vậy. Khi nào muốn, con nói “con muốn thì thầm” nhé.\n" +
                        "\n" +
                        "Chủ nhật sau, cậu bé đi lễ với ông bố. Ngồi một lát, cậu bé kêu bố và nói:\n" +
                        "\n" +
                        "– Bố ơi! Con muốn thì thầm.\n" +
                        "\n" +
                        "Ông bố thoáng ngạc nhiên nhưng cũng nói:\n" +
                        "\n" +
                        "– Được, con cứ thì thầm vào… tai bố đây."
            ),
            Story(
                "Học bài", "Buổi trưa, giọng đọc bài ê a của một cậu bé vang lên:\n" +
                        "\n" +
                        "– Nguyên nhân, sách giáo khoa. Ý nghĩa, sách giáo khoa.\n" +
                        "\n" +
                        "Bà mẹ ngạc nhiên hỏi:\n" +
                        "\n" +
                        "– Bài học gì lạ vậy hả con?\n" +
                        "\n" +
                        "– Thì con chép lại trên bảng của cô, rồi học thuộc lòng mà."
            ),
            Story(
                "Nghề gì?\n" +
                        "\n", "Hai đứa trẻ nói chuyện với nhau:\n" +
                        "\n" +
                        "– Cha tớ góp phần làm cho xã hội trong sạch.\n" +
                        "\n" +
                        "– Cha cậu làm nghề gì? Ông ấy là cảnh sát à?\n" +
                        "\n" +
                        "– Không, ông ấy không phải là cảnh sát.\n" +
                        "\n" +
                        "– Ông ấy là thẩm phán à.\n" +
                        "\n" +
                        "– Không, ông ấy là nhà sản xuất xà bông."
            )
        )
    )
    private val tragedies = Topic(
        "Truyện Bi Kịch", R.drawable.img_3, stories = arrayListOf(
            Story(
                "My Beloved And I.",
                "My beloved and I cannot be together–or so they say. But why? I still don’t really understand, but t..."
            ),
            Story(
                "Unexpected",
                "Edwin's Pregnant wife asked him to bring some fruits for her from the Kitchen so he strolled downstairs from the bed...",
            ),
            Story(
                "The End Of Me",
                "My hairs stood on end. A shiver raced down my spine and a lump came to a stop in my throat as my eyes glanced ..."
            ),
            Story(
                "February 14",
                "A short piece by Ola_Olowo Love they say is like rubber band held at both ends by two people. When one releases i..."
            )
        )
    )
    private val loveStory = Topic(
        "Truyện Ngôn Tình", R.drawable.img_4, stories = arrayListOf(
            Story(
                " Ngày Chia Tay Hôm Ấy Trời Mưa Rất To",
                "Dưới chân núi Nam Sơn có một cái cây nọ, nghe đồn rất linh. Chỉ cần mang khóa đồng tâm khóa tên người mình thích lên đó thì cả hai sẽ bên nhau mãi mãi. Hôm ấy, trong nhóm chat lớp có người gửi vào bức ảnh chụp một chiếc khóa đồng tâm:\n" +
                        "‘Hạ Thiên & Từ Bất Châu: Một đời một kiếp’\n" +
                        "Hạ Thiên là một cô gái bình thường, bình thường đến nỗi khi đặt tên cô cạnh tên chàng thiếu niên chói lọi ấy, nhất định sẽ bị cười nhạo"
            ), Story(
                "LỄ ĐƯỜNG CỦA TÔI KHÔNG CÓ CHỖ CHO ANH",
                "Bạch Nhược đời trước bị người nhục nhã, bị người coi thường…\n" +
                        "\n" +
                        "Nhưng chết đi sống lại khiến cô thay đổi, cơ hội trọng sinh này, cô phải nắm thật chặt, thay đổi nhân sinh, lại gấp bội hết thảy những kẻ đã làm tổn thương cô."
            ), Story(
                "QUÃNG ĐỜI CÒN LẠI LÀ EM",
                "Buổi tối, Tôn Phụng và Lăng Viễn nằm trên giường, cô nghiên cứu số liệu trong Ipad, còn Lăng Viễn đang đọc sách. Tôn Phụng nghiêng đầu qua, ngắm nhìn Lăng Viễn bên cạnh, cảm giác này rất không chân thực, kiểu thế giới hai người này đối với cô mà nói quá đỗi xa vời, trong hơn 40 năm cuộc đời của mình, giới tính khác trong cuộc sống ngoài con trai cô, thì chỉ còn lại một Vệ Cương cô không dám đến gần. Mà hiện tại, mình có thể cùng Lăng Viễn nằm cùng trên một giường, hơn nữa cô giơ tay ra là có thể chạm vào mặt anh.\n" +
                        "\n" +
                        "Lăng Viễn phát hiện Tôn Phụng đang nhìn mình, xoa xoa đầu cô, “Em sao vậy?”Tôn Phụng lắc đầu, “Không có gì, em chỉ cảm thấy thật kỳ diệu, em cứ cho rằng cuộc đời này sẽ sống một mình mãi như vậy, không ngờ trong sinh mạng của em còn có thể xuất hiện một người là anh.”“Là anh đã xuất hiện quá muộn.” Trong lời nói của Lăng Viễn mang theo sự áy náy sâu đậm, “Không biết những năm nay,"
            ), Story(
                "NUÔNG CHIỀU EM TỚI TẬN XƯƠNG TỦY",
                "Sau khi nữ diễn viên tuyến 18* Phó Vị Vũ tỏ tình với nam thần bị từ chối, cô tức giận và dốc toàn lực cho sự nghiệp, bởi vì theo đuổi mãi một nam nhân đã bỏ chạy thì thật không đáng!\n" +
                        "\n" +
                        "(*)dùng để ám chỉ những diễn viên kém nổi, thường chỉ đóng vai phụ, nói nôm na là “vô danh tiểu tốt”\n" +
                        "\n" +
                        "Sau 3 năm thất tình, bộ phim truyền hình do Phó Vị Vũ đóng vai chính trở nên nổi tiếng chỉ sau một đêm.\n" +
                        "\n" +
                        "Vào đêm hội từ thiện của các ngôi sao, Phó Vị Vũ trong bộ váy lộng lẫy, khoác tay bạn diễn xuất hiện trên thảm đỏ, thể hiện thái độ thân mật giữa hai người."
            )
        )
    )
    private val topics = mutableListOf<Topic>(story, jokes, tragedies, loveStory)

    //    private var rcTopic:RecyclerView?=null
    private lateinit var rcTopic: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rcTopic = findViewById(R.id.rc_topic)
        val adapter = TopicAdapter(topics, this)
        rcTopic.adapter = adapter
        rcTopic.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
    }
}