# Cyber_Security_Group_9_Task_2


Ky kod është shkruar në gjuhën programuese Java dhe është përdorur teknika e enkriptimit One Time Pad. 
Kjo është një mënyrë e thjeshtë për të enkriptuar dhe dekriptuar mesazhet duke përdorur një çelës të rastësishëm i cili është i gjatë aq sa mesazhi që do të enkriptohet.

Funksioni "generateKeyStream" krijon një numër të rastësishëm bajtesh si një stream që do të përdoret si çelës për enkriptimin dhe dekriptimit e tekstit.
Ky stream krijohet nga një seed si hyrje në funksion dhe gjenerohet duke përdorur funksionin "hashCode()" të fjalëkalimit si vlerë fillestare për një objekt të klasës "Random".

Funksioni "xor" kombinon çdo bajt të tekstit hyrës me çdo bajt të keystream-it duke përdorur operacionin XOR dhe kthen një varg të ri bajtësh.

Funksioni "symmetricEncrypt" gjeneron stream-in e çelësit duke përdorur fjalëkalimin e hyrjes dhe gjatësinë e mesazhit të plaintext-it, dhe më pas kodon plaintext-in duke e bërë XOR atë me keystream. 
Rezultati është një varg bajtësh që përfaqëson ciphertext-in.

Funksioni "symmetricDecrypt" dekripton ciphertext-in duke gjeneruar përsëri keystream-in duke përdorur çelësin dhe gjatësinë e ciphertext-it, 
dhe më pas duke e bërë XOR atë me ciphertext-in. Rezultati është një varg që përfaqëson plaintext-in.

Funksioni "main"  ekzekuton funksionet e enkriptimit dhe dekriptimit, duke enkriptuar një "Hello, world!" plaintext duke përdorur një çelës "why_is_this_key_different", 
dhe më pas dekriptimi i ciphertext-it që marrim si rezultat. 

Funksioni "bytesToHex" përdoret për të kthyer vargun e bajtëve në një varg heksadecimal për printim.


Anëtarët e grupit:
Bleron Morina,
Blerona Jashanica,
Blert Osmani,
Blerta Azemi
