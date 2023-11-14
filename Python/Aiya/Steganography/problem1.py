import re

def decrypt(ciphertext: str) -> str:
    return re.sub(r'\W+', '', ciphertext).lower()[3::4]


def main():
    print(decrypt('zerhvuli'))
    print(decrypt('llbsdryeobfcsisthvvieuiozxdnsyltdtjwliho'))
    print(decrypt('Glybkisa xuibrakyyyds huohmeiani erz cjk'))
    print(decrypt('Xatr, pyko te kmh. Oietfko')) 
    print(decrypt('Mox, jiwg uwh xlfhqi. Qqweaklt!'))
    print(decrypt('Jo yr en oo vj es fi ga hp il mm wi mg vn vt qd.'))


if __name__ == "__main__":
    main()