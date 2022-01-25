   public abstract class SocialNetworkClasses<string, post_source, likes, geo> {
    int ID;
    int ownerID;
    int Created_by;
    int from_id;
    int reply_owner_id;
    int	Repliedpostsid;
    int  friends_only[1];
    int can_pin;
    int can_delete;
    int  can_edit ;
    int is_pinned ;
    int marked_as_ads;
    string post_type;
    string text;
    public class Post {
        private int id;
        private int ownerId; // поле из документации
        private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
        // + get/set на все поля
    }
    public class CommentsInfo {
        private int count;
        private boolean canPost;
        // + get/set на все поля
    }

    boolean is_favorite;

    Class object(post_source) {
        return null;
    }

    abstract <reposts> Class object(reposts);
//    count (integer) — Number of users who copied the post.
//            user_reposted* (integer, [0,1]) — Whether the user reposted the post (0 — not reposted, 1 — reposted).
abstract Class object(likes);

    //    count (integer) — likes count;
//    user_likes* (integer, [0,1]) — Whether the user liked the post (0 — not liked, 1 — liked).
//    can_like* (integer, [0,1]) — Whether the user can like the post (0 — cannot, 1 — can).
//    can_publish* (integer, [0,1]) — Whether the user can repost (0 — cannot, 1 — can).
    <comments> Class object(comments) {
        return null;
    }

       //    count (integer) — comments count;
//    can_post* (integer, [0,1]) — shows if current user can comment the post. ("1 — yes, 0'' — no);
//    groups_can_post (integer, [0,1]) — information whether communities can comment this post.
     abstract Class object(geo) {
           return null;
       }
//    type (string) — location type;
//    coordinates (string) — location coordinates;
//    place (object) — place description (if added), contain fields:
//    id (integer) — place ID (if available);
//    title (string) — place title (if available);
//    latitude (integer) — geographical latitude;
//    longitude (integer) — geographical longitude;
//    created (integer) — date when the place has been created (if available);
//    icon (string) — URL of icon image;
//    country (string) — country name;
//    city (string) — city name;
//    If place id added as a checkin, place object has additional fields:
//    type (integer) — checkin type;
//    group_id (integer) — community ID;
//    group_photo (string) — URL of the community preview image;
//    checkins (integer) — checkins number;
//    updated (integer) — time of the last checkin in Unixtime;
//    address (integer) — address;



}
