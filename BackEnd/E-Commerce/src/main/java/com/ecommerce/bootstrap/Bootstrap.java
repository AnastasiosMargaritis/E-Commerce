package com.ecommerce.bootstrap;

import com.ecommerce.domain.Book;
import com.ecommerce.domain.User;
import com.ecommerce.domain.UserRole;
import com.ecommerce.repository.BookRepository;
import com.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setFirstName("Anastasios");
        user1.setLastName("Margaritis");
        user1.setUsername("AnasMarg");
        user1.setPassword("1234");
        user1.setEmail("anastasismargaritis@gmail.com");
        user1.setUserRoles(UserRole.USER);
        this.userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("Anthi");
        user2.setLastName("Molozi");
        user2.setUsername("AnthiMl");
        user2.setPassword("1234");
        user2.setEmail("anthimolozi@gmail.com");
        user2.setUserRoles(UserRole.USER);
        this.userRepository.save(user2);

        User user3 = new User();
        user3.setFirstName("George");
        user3.setLastName("Margaritis");
        user3.setUsername("GeorgeMargar");
        user3.setPassword("1234");
        user3.setEmail("georgemargaritis@gmail.com");
        user3.setUserRoles(UserRole.USER);
        this.userRepository.save(user3);

        User user4 = new User();
        user4.setFirstName("Eleana");
        user4.setLastName("Margariti");
        user4.setUsername("ElMargar");
        user4.setPassword("1234");
        user4.setEmail("elmargar@gmail.com");
        user4.setUserRoles(UserRole.USER);
        this.userRepository.save(user4);

        User user5 = new User();
        user5.setFirstName("Alexandros");
        user5.setLastName("Margaritis");
        user5.setUsername("AlMargar");
        user5.setPassword("1234");
        user5.setEmail("alexmarg@gmail.com");
        user5.setUserRoles(UserRole.USER);
        this.userRepository.save(user5);


        User user6 = new User();
        user6.setFirstName("Admin");
        user6.setLastName("Admin");
        user6.setUsername("Admin");
        user6.setPassword("12345");
        user6.setEmail("Admin@gmail.com");
        user6.setUserRoles(UserRole.ADMIN);
        this.userRepository.save(user6);


        List<Book> books = new ArrayList<>();

        Book book = new Book();
        book.setId(1L);
        book.setAuthor("J.K.Rowling");
        book.setTitle("Harry Potter and the Philosopher's Stone");
        book.setCategory("Fiction");
        book.setDescription("Harry Potter has been living an ordinary life, constantly abused by his surly and cold aunt and uncle, Vernon and Petunia Dursley and bullied by their spoiled son Dudley since the death of his parents ten years prior. His life changes on the day of his eleventh birthday when he receives a letter of acceptance into Hogwarts School of Witchcraft and Wizardry, delivered by a half-giant named Rubeus Hagrid after previous letters had been destroyed by Vernon and Petunia. Hagrid details Harry's past as the son of James and Lily Potter, who were a wizard and witch respectively, and how they were murdered by the most evil and powerful dark wizard of all time, Lord Voldemort, which resulted in the one-year-old Harry being sent to live with his aunt and uncle. Voldemort was not only unable to kill Harry, but his powers were also destroyed in the attempt, forcing him into exile and sparking Harry's immense fame among the magical community.\n" +
                "\n" +
                "Hagrid introduces Harry to the wizarding world by bringing him to Diagon Alley, a hidden street in London, where Harry uncovers a fortune left to him by his parents at Gringotts Wizarding Bank. He also receives a pet owl, Hedwig, various school supplies, and a wand (which he learns shares a core from the same source as Voldemort's wand). There, he is surprised to discover how famous he truly is among witches and wizards as \"The Boy Who Lived\". A month later, Harry leaves the Dursleys' home to catch the Hogwarts Express from King's Cross railway station's secret Hogwarts platform, Platform \u200B9 3⁄4. On the train, he quickly befriends fellow first-year Ronald Weasley and the two boys meet Hermione Granger, whose snobbiness and affinity for spells initially causes the two boys to dislike her. There, Harry also makes an enemy of yet another first-year, Draco Malfoy, who shows prejudice against Ron for his family's financial difficulties.\n" +
                "\n" +
                "Arriving at Hogwarts, the first-years are assigned by the magical Sorting Hat to Houses that best suit their personalities, the four Houses being Gryffindor, Slytherin, Hufflepuff and Ravenclaw. Harry hears from Ron about Slytherin's dark reputation which is known to house potential dark witches and wizards, and thus objects to being sorted into Slytherin despite the Hat claiming that Harry has potential to develop under that House. He winds up in Gryffindor with Ron and Hermione, while Draco is sorted into Slytherin like his family before him.\n" +
                "\n" +
                "As classes begin at Hogwarts, Harry discovers his innate talent for flying on broomsticks despite no prior experience, and is recruited into his House's team for Quidditch (a competitive wizards' sport sharing similarities to football, but played on flying broomsticks) as a Seeker. He also comes to dislike the school's Potions master, Severus Snape, who is also the Head of Slytherin House who acts with bias in favour of members of his House while perpetually looking for opportunities to fail Harry and his friends. Malfoy tricks Harry and Ron into a duel in the trophy room to get them out of their rooms at night and secretly tells Filch, the school's caretaker, where they will be. Hermione unintentionally is forced to come along after her failed attempts to stop them, and they find Gryffindor student Neville Longbottom asleep outside the common area because he had forgotten the password to get in. After realizing the duel was a set-up to get them in trouble, they run away. They then discover a huge three-headed dog standing guard over a trapdoor in a forbidden corridor. The school's Halloween celebrations are interrupted by the entrance of a troll into the school, which enters the girls' bathroom where Hermione was. However, she is saved by Harry and Ron and, as a result, Hermione is grateful and the three become best friends. Coupled with Snape's recent leg injury as well as behaviour, the recent events prompt Harry, Hermione and Ron to suspect him to be looking for a way to enter the trapdoor.\n" +
                "\n" +
                "Hermione forbids the boys from investigating for fear of expulsion, and instead makes Harry direct his attention to his first ever Quidditch game, where his broomstick begins to lose control and threatens to throw him off. This leads Hermione to suspect that Snape had jinxed Harry's broom, due to his strange behaviour during the match. After the excitement of winning the match has died down, Christmas arrives and Harry receives an invisibility cloak from an anonymous source claiming that the cloak belonged to Harry's father. Using the cloak to explore the school at night to investigate what is under the trapdoor, he discovers the Mirror of Erised, in which the viewer sees his or her deepest desires come true. Within the Mirror, Harry sees himself standing with both of his parents.\n" +
                "\n" +
                "A visit to Hagrid's hut at the foot of the school leads the trio to find a newspaper report stating there had been an attempted robbery of a Gringotts vault—the same vault that Hagrid and Harry had visited when the latter was getting his school supplies. A further indiscretion from Hagrid allows them to work out that the object kept under that trapdoor is a Philosopher's Stone, which grants its user immortality as well as the ability to turn any metal into pure gold. Harry is also informed by a centaur named Firenze in the forest that a plot to steal the Stone is being orchestrated by none other than Voldemort himself, who schemes to use it to be restored back to his body and return to power. When the school's headmaster Albus Dumbledore is lured from Hogwarts under false pretences, Harry, Hermione and Ron fear that the theft is imminent and descend through the trapdoor themselves.\n" +
                "\n" +
                "They encounter a series of obstacles, each of which requires unique skills possessed by one of the three, one of which requires Ron to sacrifice himself in a life-sized game of wizard's chess. In the final room, Harry, now alone, finds Quirinus Quirrell, the Defence Against the Dark Arts teacher, who reveals he had been the one working behind the scenes to kill Harry by first jinxing his broom and then letting a troll into the school, while Snape had been trying to protect Harry instead. Quirrell is helping Voldemort, whose face has sprouted on the back of Quirrell's head but is constantly concealed by his oversized turban, to attain the Philosopher's Stone so as to restore his body. Quirrell uses Harry to get past the final obstacle, the Mirror of Erised, by forcing him to stand before the Mirror. It recognises Harry's lack of greed for the Stone and surreptitiously deposits it into his pocket. As Quirrell attempts to seize the stone and kill Harry, his flesh burns on contact with the boy's skin and breaks into blisters. Harry's scar suddenly burns with pain and he passes out.\n" +
                "\n" +
                "Three days later, he awakens in the school's infirmary, where Dumbledore explains his survival against Voldemort is due to his mother's sacrificing her life in order for him to live. This left a powerful protective charm on Harry that lives in his blood, which caused Quirrell's hands to burn on contact with Harry due to him being possessed by hatred and greed. He also reveals himself as the one who sent Harry his father's invisibility cloak, while Quirrell has been left to die by Voldemort, who still lives, and the Stone has now been destroyed. The eventful school year ends at the final feast, during which Gryffindor wins the House Cup. Harry returns to Privet Drive for the summer, neglecting to tell the Dursleys that the use of spells is forbidden by under-aged wizards and witches and thus anticipating some fun and peace over the holidays.");
        book.setFormat("Hardcovered");
        book.setIsbn("978-0-9706726-8-1");
        book.setLanguage("English");
        book.setNumberOfPages(246);
        book.setListPrice(5.99);
        book.setOurPrice(9.99);
        book.setShippingWeight(0.4);
        book.setStockNumber(35);
        book.setPublisher("Bloomsbury");
        book.setPublicationDate("26-06-1997");
        book.setActive(true);

        books.add(book);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setAuthor("J.K.Rowling");
        book2.setTitle("Harry Potter and the Deathly Hallows");
        book2.setCategory("Fiction");
        book2.setFormat("Hardcovered");
        book2.setIsbn("978-0-9708546-8-1");
        book2.setLanguage("English");
        book2.setNumberOfPages(624);
        book2.setListPrice(7.99);
        book2.setOurPrice(14.99);
        book2.setShippingWeight(0.72);
        book2.setStockNumber(60);
        book2.setPublisher("Bloomsbury");
        book2.setPublicationDate("21-07-2007");
        book2.setActive(true);
        book2.setDescription("Following Albus Dumbledore's death, Voldemort consolidates support and power, including attempting to take control of the Ministry of Magic. Meanwhile, Harry is about to turn seventeen, at which time he will lose the protection of his home. Members of the Order of the Phoenix explain the situation to the Dursleys and move them to a new location for protection. Using several of Harry's peers and friends as decoys, the Order plans to move Harry to the Burrow under protection, by flying him there. However, the Death Eaters have been tipped off about this plan, and the group is attacked upon departure. In the ensuing battle, \"Mad-Eye\" Moody and Hedwig are killed and George Weasley severely wounded. Voldemort himself arrives to kill Harry, but Harry's wand fends him off on its own.\n" +
                "\n" +
                "At the Burrow, Harry, Ron, and Hermione make preparations to abandon Hogwarts and hunt down Voldemort's four remaining Horcruxes but have few clues as to their identities and locations. They also inherit strange bequests from among Dumbledore's possessions: a Golden Snitch for Harry, a Deluminator for Ron, and a book of short tales collectively called The Tales of Beedle the Bard for Hermione. They are also bequeathed the Sword of Hogwarts co-founder Godric Gryffindor, which they learn has the power to destroy Horcruxes, but the Ministry prevents them from receiving it. During Bill Weasley and Fleur Delacour's wedding, the Ministry of Magic falls to Voldemort, and the wedding is attacked by Death Eaters. Harry, Ron, and Hermione flee to 12 Grimmauld Place in London, the family home of Sirius Black that Harry inherited a year before.\n" +
                "\n" +
                "Harry realizes that Sirius's late brother Regulus was the person who had stolen the real Horcrux locket, and had hid it in the Black house, where it was stolen by the criminal and Order associate Mundungus Fletcher. With the help of his house-elf Kreacher, the trio locate Fletcher, who had since had the locket taken from him by Dolores Umbridge, a Ministry official and Harry's old nemesis.\n" +
                "\n" +
                "Harry, Ron and Hermione infiltrate the Ministry of Magic and successfully steal the locket from Umbridge, but, as they escape, Ron is injured and the Grimmauld Place safehouse is compromised, forcing the three to hide out in the Forest of Dean. There, with no way to destroy the Horcrux locket and no further leads, they pass many weeks on the run, living in fear and hearing little news from the outside world. The piece of Voldemort's soul within the locket exerts a negative emotional influence on all of them, especially Ron; his injury, fears for his family, and existing insecurities are amplified, leading him to abandon Harry and Hermione.\n" +
                "\n" +
                "Harry and Hermione continue the quest for the Horcruxes, discovering more about Dumbledore's past, including the death of Dumbledore's younger sister and his connection to the dark wizard Gellert Grindelwald. They travel to Godric's Hollow, Harry's birthplace, and meet the elderly magical historian Bathilda Bagshot. However, they discover that the real Bathilda has been killed, instead being Nagini in disguise. The snake attacks, and they barely escape, but Harry's wand is damaged beyond repair in the fight. One day, a mysterious silver doe Patronus guides Harry to a pond containing the Sword of Godric Gryffindor. When Harry tries to recover the sword, the locket Horcrux tries to kill him. Ron, who was guided back to Harry and Hermione by the Deluminator, saves him and destroys the locket using the sword.\n" +
                "\n" +
                "Reading Dumbledore's book, Hermione identifies a symbol also worn at Bill and Fleur's wedding by Xenophilius Lovegood, the father of fellow Hogwarts student Luna Lovegood. They visit Xenophilius and are told the symbol represents the mythical Deathly Hallows, three objects from an old fairy tale titled The Tale of the Three Brothers: the Elder Wand, an unbeatable wand; the Resurrection Stone, which is able to summon the dead; and an infallible Invisibility Cloak. After noticing inconsistencies in his behavior, however, the trio realise that Xenophilius is stalling to allow Death Eaters to catch Harry, in exchange for his daughter Luna's freedom. After a near miss, the three reflect on what they learned. Although Ron and Hermione are skeptical, Harry believes the Hallows are real and suspects Voldemort is hunting the Elder Wand, believing it to be in Dumbledore's possession after he defeated Grindelwald. The description of the third Hallow also matches that of his own inherited Invisibility Cloak, and he believes the Snitch given to him by Dumbledore contains the Resurrection Stone.\n" +
                "\n" +
                "The trio are captured by Snatchers and taken to Malfoy Manor. Ron and Harry are imprisoned, and Bellatrix tortures Hermione, believing they stole Gryffindor's sword from her vault at Gringotts. With the help of Dobby the house-elf, they escape to Bill and Fleur's house along with fellow prisoners Luna Lovegood, wandmaker Mr. Ollivander, Dean Thomas, and the goblin Griphook. During the escape, Peter Pettigrew is strangled by his silver hand after a brief moment of mercy towards Harry, and Dobby is killed by Bellatrix. At Bill and Fleur's, they devise a plan to break into Bellatrix's vault at Gringotts, believing another Horcrux to be hidden there. While there, Harry's has a vision of Voldemort breaking open Dumbledore's tomb and stealing the Elder Wand, confirming his suspicions. With Griphook's help, they succeed in breaking in, retrieving Hufflepuff's golden cup, and escape on a dragon that was guarding Bellatrix's vault. In the chaos, Griphook steals the Sword of Gryffindor from them. Harry has another vision of Voldemort, in which he is informed of the heist. Enraged, Voldemort decides to check on and protect his Horcruxes, accidentally revealing that the unidentified Horcrux is at Hogwarts.\n" +
                "\n" +
                "They enter the school through a secret entrance in the Hog's Head, a bar in Hogsmeade owned by Dumbledore's brother Aberforth. While searching for the Horcrux, which he suspects to be an artifact of Ravenclaw, Harry accidentally alerts Voldemort to his presence at the school. Voldemort immediately plots an assault on Hogwarts, so the teachers mobilize the student body to defend the school and buy Harry time to locate the Horcrux. Meanwhile, Ron and Hermione destroy Hufflepuff's cup with basilisk fangs taken from the Chamber of Secrets as Voldemort and his army besiege the castle. Speaking with the ghost of Rowena Ravenclaw's daughter, Harry confirms that the Horcrux is Ravenclaw's lost diadem, which he recalls as being hidden in the Room of Requirement. The trio find the diadem but are ambushed by Draco Malfoy and his friends Crabbe and Goyle. Crabbe tries to kill them using Fiendfyre, a cursed fire, but is unable to control it; the fire destroys the diadem and kills Crabbe. Meanwhile, many are killed in the Battle of Hogwarts, including Remus Lupin, Nymphadora Tonks, Colin Creevey, and Fred Weasley.\n" +
                "\n" +
                "In his encampment, Voldemort feels the Elder Wand is not performing as he expected. Reasoning that Snape, having killed Dumbledore, is the true owner of the Elder Wand, Voldemort murders Snape. Harry arrives as Snape is dying, and Snape passes him memories to view in the Pensieve. They reveal Snape had a lifelong love for Harry's mother, and despite hating Harry's father, he agreed at Dumbledore's request to act as a double agent against Voldemort. He had been watching over the trio as they searched for the Horcruxes, conjuring the doe Patronus. It is also revealed that Dumbledore was dying after mishandling the ring Horcrux, and his \"murder\" by Snape was planned to prove Snape's allegiance to Voldemort. The memories also explain that Harry himself is a Horcrux, unbeknownst to Voldemort, and that he must die at Voldemort's hands if Voldemort is to become mortal. Harry accepts his death and gives himself up to Voldemort, telling Neville Longbottom that Voldemort's snake Nagini, another Horcrux, must be killed. On the way, he manages to open the Snitch and briefly uses the Resurrection Stone within to seek comfort and courage from his dead loved ones, before losing it as he meets Voldemort. Harry does not defend himself as Voldemort uses the Killing Curse on him.\n" +
                "\n" +
                "Harry awakens in a dreamlike location resembling King's Cross station and is greeted by Dumbledore. He explains that Voldemort's original Killing Curse left a fragment of Voldemort's soul in Harry, which caused the connection they felt and made Harry an unintended Horcrux. The fragment had been destroyed by the Killing Curse, allowing Harry the choice to return to life or to \"go on.\" Dumbledore also admits some of his mysterious history, in which his friendship with Gellert Grindelwald resulted in the murder of his younger sister Ariana and estrangement from Aberforth. Harry chooses to return to life and feigns death. Voldemort calls for a truce at Hogwarts and displays Harry's body, offering to spare the defenders if they surrender. Neville, however, pulls the Sword of Gryffindor out of the Sorting Hat and uses it to behead Nagini, rendering Voldemort mortal.\n" +
                "\n" +
                "Harry hides under his cloak as the battle resumes. In a final onslaught, Bellatrix is killed by Molly Weasley, and Harry reveals himself to Voldemort. He explains to Voldemort the Elder Wand's loyalty transfers upon the defeat, not necessarily the killing, of its previous master. Harry also reveals that Snape had never been the Elder Wand's master because Draco Malfoy had disarmed Dumbledore before Snape killed him. Having disarmed Draco at Malfoy Manor weeks prior, Harry is now the master of the Elder Wand. Voldemort attempts one final Killing Curse on Harry, but the Elder Wand refuses to act against its master and the spell rebounds, killing Voldemort. Harry uses the Elder Wand to repair his original wand, intending to return the Elder Wand to Dumbledore's tomb, where its power will vanish if Harry dies undefeated. He also plans to keep his Invisibility Cloak, while allowing the Resurrection Stone to remain lost in the forest. The wizarding world returns to peace once more.\n" +
                "\n" +
                "Epilogue\n" +
                "In an epilogue set in King's Cross station 19 years later, the primary characters are seeing their own children off to Hogwarts. Harry and Ginny have three children: James Sirius, Albus Severus, and Lily Luna. Ron and Hermione also have two children, Rose and Hugo. Harry's godson Teddy Lupin is found kissing Bill Weasley and Fleur Delacour's daughter Victoire; Neville Longbottom is now a Hogwarts professor; and Draco Malfoy and his wife are also at the station to send off their son, Scorpius. Albus is departing for his first year at Hogwarts and worries he will be placed in Slytherin House. Harry reassures him by telling his son he is named after two Hogwarts headmasters, one of them a Slytherin and \"the bravest man he had ever met,\" and that the Sorting Hat could account for his personal preferences as it did for Harry. Noting that his scar has not hurt in nineteen years, Harry is at peace, as \"all is well\".");

                books.add(book2);

        Book book3 = new Book();
        book3.setId(3L);
        book3.setAuthor("J.K.Rowling");
        book3.setTitle("Harry Potter and the Chamber of Secrets");
        book3.setCategory("Fiction");
        book3.setFormat("Hardcovered");
        book3.setIsbn("978-0-4578546-8-1");
        book3.setLanguage("English");
        book3.setNumberOfPages(288);
        book3.setListPrice(3.99);
        book3.setOurPrice(7.99);
        book3.setShippingWeight(0.4);
        book3.setStockNumber(15);
        book3.setPublisher("Bloomsbury");
        book3.setPublicationDate("02-07-1996");
        book3.setActive(true);
        book3.setDescription("On Harry Potter's twelfth birthday, the Dursley family—Harry's uncle Vernon, aunt Petunia, and cousin Dudley—hold a dinner party for a potential client of Vernon's drill-manufacturing company. Harry is not invited but is content to spend the evening quietly in his bedroom, although he is confused why his school friends have not sent cards or presents. However, while in his room, a house-elf named Dobby shows up at his house and warns him not to return to Hogwarts and admits to intercepting Harry's post from his friends. Having failed to persuade Harry to voluntarily give up his place at Hogwarts, Dobby then attempts to get him expelled by using magic to smash Aunt Petunia's dessert on the kitchen floor and framing Harry, who is not allowed to use magic outside school. Uncle Vernon's business deal falls through, but Harry is given a second chance from the Ministry of Magic and allowed to return at the start of the school year.\n" +
                "\n" +
                "In the meantime, Uncle Vernon punishes Harry, fitting locks to his bedroom door and bars to the windows. However, Harry’s best friend Ron Weasley arrives with his twin brothers Fred and George in their father Arthur’s enchanted Ford Anglia. They rescue Harry, who stays at the Weasley's family home, the Burrow, for the remainder of his holidays. Harry and the other Weasleys—mother Molly, third-eldest son Percy, and daughter Ginny (who has a crush on Harry)—travel to Diagon Alley. They are then reunited with Hermione Granger and introduced to Lucius Malfoy, father of Harry’s school nemesis Draco, and Gilderoy Lockhart, a conceited autobiographer who has been appointed Defence Against the Dark Arts professor after the death of Professor Quirrell. When Harry and Ron approach Platform 93⁄4. in King's Cross station, it refuses to allow them to pass. They decide to fly Arthur’s car to Hogwarts after missing the train when they cannot get through the barrier. Harry and Ron crash into a Whomping Willow on the grounds, and Ron's wand is damaged.\n" +
                "\n" +
                "In punishment for the crash, Ron cleans the school trophies, and Harry helps Professor Lockhart, whose classes are chaotic, with addressing his fan mail. Harry learns of some wizards' prejudice about blood status in terms of “pure” blood (only wizarding heritage) and those with Muggle (non-magical) parentage. He is alone in hearing an unnerving voice seemingly coming from the walls of the school itself. During a deathday party for Gryffindor House’s ghost Nearly Headless Nick, Harry, Ron, and Hermione run into the school caretaker Argus Filch’s petrified cat, Mrs. Norris, along with a warning scrawled on the wall: “The Chamber of Secrets has been opened. Enemies of the heir, beware.”\n" +
                "\n" +
                "Rumours fly around the school regarding the Chamber of Secrets' history. Harry and his friends discover from Cuthbert Binns, the ghostly professor of History of Magic, that it allegedly houses a terrible monster and was created by one of the school’s founders, Salazar Slytherin, after a fundamental disagreement with the other founders (Godric Gryffindor, Helga Hufflepuff, and Rowena Ravenclaw). Slytherin believed students of non-magical parentage should be refused entry to the school. So, he built the chamber to finish his mission. Only his heir can open it and control the monster inside. During a Quidditch game, a Bludger, one of the balls involved in Quidditch, chases after Harry instead of zigzagging toward any player it can hit. The rogue Bludger breaks Harry's arm. In an attempt to mend it, Lockhart accidentally removes all the bones from Harry's broken arm, which requires an overnight stay in the hospital wing to heal. Dobby returns in the middle of the night to visit Harry in the hospital wing, revealing that it was he who charmed the Bludger and sealed the gateway at King’s Cross and that the Chamber of Secrets was opened before. Another attack occurs, this time on a first-year Gryffindor named Colin Creevey, who idolises Harry, and the school goes into a state of panic. A duelling class is then set up for the students (led by Lockhart and Potions master/Head of Slytherin House Severus Snape), during which it is revealed that Harry is a 'Parselmouth', meaning he has the rare ability to speak to snakes.\n" +
                "\n" +
                "This sparks rumours yet again because students around the school suspect Harry is the Heir of Slytherin (Salazar Slytherin was also a Parselmouth). Circumstantial evidence to support this theory arrives in the form of another attack, this time on Hufflepuff second-year Justin Finch-Fletchley and Nearly Headless Nick. Harry, Ron, and Hermione begin to suspect Draco Malfoy is behind the attacks, given his family history of remaining well within Slytherin ranks and open hostility toward Muggle-born students. After talking about their speculations, Hermione concocts Polyjuice Potion, which allows Harry and Ron to look like Draco’s boorish lackeys, Vincent Crabbe and Gregory Goyle, for an hour. Harry and Ron use this hour to interrogate Draco. This comes to nothing because Draco’s father only told his son the general facts of the previous opening of the Chamber and that it occurred fifty years previously. Meanwhile, \"Moaning\" Myrtle Warren, an existentially mopey ghost that haunts a girls' bathroom at Hogwarts, unwittingly provides a new clue in the form of a diary deposited in her stall. The trio discover the diary belonged to Tom Riddle, a student who knows all too well about the Chamber, having been witness to a fellow student’s death while the Chamber was opened fifty years ago. The culprit, Riddle reveals to Harry, was none other than Rubeus Hagrid, now gamekeeper for Hogwarts. When Hermione is attacked next, alongside a Ravenclaw prefect, the school is put on lockdown, and headmaster Albus Dumbledore and Hagrid are forced to leave.\n" +
                "\n" +
                "Fortunately for Harry and Ron, Hagrid left a set of instructions: follow the spiders currently fleeing into the Forbidden Forest. They do this, only to find the monster that was blamed for the attacks fifty years before, a massive Acromantula named Aragog, who explains to them that the real monster is one spiders fear above all others. When Harry and Ron try to leave, Aragog says they cannot leave because his sons and daughters have not eaten for a long time and plan to eat the boys. Before the spiders can grab them, Arthur's Ford Anglia arrives, and the boys use the car to escape. Hermione provides the last set of clues that inform them of the monster’s identity: a basilisk, (hence Harry’s ability to understand it) that kills with a stare (although no one is dead because of various devices through which they indirectly saw the monster) and that spiders (such as Aragog and his offspring) fear above all others. Harry figures out from hints Aragog dropped that the student who died during the previous attacks was Myrtle, and when Ginny is taken by the monster into the Chamber, Harry and Ron discover that the entrance is in the bathroom they have been using to make Polyjuice Potion. Harry, Ron, and Lockhart enter the Chamber, but the dunderheaded professor (who reveals that he is a fraud) causes a rockfall while attempting to erase the boys’ memories with Ron’s damaged wand, permanently losing his memory in the process.\n" +
                "\n" +
                "Separated from Ron, Harry enters the Chamber of Secrets alone to find an unconscious Ginny and Tom Riddle, who claims to be a memory preserved in his diary for the last fifty years. Riddle shows Harry that his full name, Tom Marvolo Riddle, can be made into the anagram \"I am Lord Voldemort.\" Tom Riddle is in fact Voldemort's true name, and it was he who opened the Chamber fifty years before and framed Hagrid. Riddle is the true Heir of Slytherin. By possessing Ginny through his diary, Riddle has been continuing what he started fifty years before. Harry's loyalty to Dumbledore in the face of Riddle summons Dumbledore's phoenix Fawkes, who arrives with the Sorting Hat. Fawkes blinds the basilisk, allowing Harry to remove the Sword of Godric Gryffindor from the Sorting Hat and slay the creature. Though fatally poisoned by the basilisk, Fawkes's healing tears save Harry, who uses a basilisk fang to stab Riddle's diary. Both the diary and Riddle are destroyed, and Ginny is restored.\n" +
                "\n" +
                "Harry, Ron, Ginny, and Lockhart return to the main castle and reunite with McGonagall, Dumbledore, and Mr. and Mrs. Weasley. Ginny, whose possession by Voldemort caused all of the petrification and troubles over the course of the year, is given a reprieve by Dumbledore. He reasons that greater wizards have been duped by Voldemort before and takes great interest in the qualities of the diary, which Harry gives to him. Lucius Malfoy bursts in after this meeting, demanding to know why and how Dumbledore has returned to the school. He is accompanied by Dobby, revealing that Dobby is enslaved to the Malfoys. The house-elf also provides Harry with unspoken clues regarding the diary’s ownership. Although it was Tom Riddle’s, it had been in the Malfoys’ possession. While in Diagon Alley over the summer, Lucius, a follower of Voldemort, had slipped the diary into Ginny's cauldron to ensure the reopening of the Chamber of Secrets. Harry returns the diary, devising a scenario involving his own sock that frees Dobby from the Malfoys’ employment, hence provoking an attack on Harry. Dobby jumps in and saves Harry. The petrified students are cured, Gryffindor wins the house cup again by earning 400 more points, Harry and Ron both receive Special Services to School award, the end-of-year exams are cancelled (much to Hermione’s chagrin), Hagrid returns in the middle of the final feast, Lockhart is discharged from his job as Defence Against the Dark Arts teacher, and Harry returns to Privet Drive in higher spirits than he last left it.");

        books.add(book3);

        this.bookRepository.saveAll(books);
    }
}
