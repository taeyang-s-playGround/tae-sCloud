package project.taes_cloud.domain.user.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity(name = "tbl_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(60)")
    private String accountId;

    @Column(columnDefinition = "VARCHAR(60)")
    private String name;

    @Column(columnDefinition = "VARCHAR(60)")
    private String password;

    private String deviceToken;

    @Builder
    public User(Long id, String accountId, String name, String password, String deviceToken) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.password = password;
        this.deviceToken = deviceToken;
    }
}
