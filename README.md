# problem-solving
## solve
> [!TIP]
> 다른 사람들이 보기쉽도록 분리하여 구현합니다

- 기능을 메서드로 분리하여 작성하고 각 메서드명을 고민해 작성합니다
- [권장] 각 메서드를 설명하는 주석을 달아줍니다 (param, return 등)
- [권장] 각 메서드를 테스트하는 코드를 작성합니다

<br/>

## git
> [!TIP]
> 다른 사람들이 보기쉽도록 git을 사용합니다

- 자신의 이름을 영어로 작성하여 브랜치를 사용합니다 (ex. `minseok`)
- commit 메세지는 `solve: {site} {problem_id}`로 통일합니다 (ex. `solve: boj 1000`)
  - 한꺼번에 올릴 경우 `solve: {date}` 형식으로 통일합니다 (ex. `solve: 2026-01-23`)
- 기능별로 메서드를 분리하여 따로 작성합니다

<br/>

## submit
> [!TIP]
> 다른 사람들이 보기쉽도록 구조화합니다

- 폴더는 `{site}/{problem_id}`를 사용하여 구조화합니다 (ex. `boj/1000`)
- 해당 폴더에 `solution.{lang_ext}` 파일을 만들어 결과를 제출합니다 (ex. `solution.go`)
