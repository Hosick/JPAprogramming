package jpabook.start;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MEMBER")
public class Member {

    @Id @Column(name = "ID")
    private String id;

    @Column(name = "name")
    private String username;

    //매핑 정보가 없는 필드
    private Integer age;
}
