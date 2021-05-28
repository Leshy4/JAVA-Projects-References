
public class WordNode {

    private String word = "";
    private int wordCount = 1;
    private WordNode nextNode = null;

    public WordNode(String w) {
        this.word = w;
    }

    public void setNext(WordNode w){
        this.nextNode = w;
    }

    public WordNode getNext(){
        return this.nextNode;
    }

    public String getWord() {
        return this.word;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public void incrementWordCount() {
        ++this.wordCount;
    }

}
