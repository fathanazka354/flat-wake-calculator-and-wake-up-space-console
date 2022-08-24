package core.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DuaDimensi {
    String name;

    public DuaDimensi(String name) {
        this.name = name;
    }
}
