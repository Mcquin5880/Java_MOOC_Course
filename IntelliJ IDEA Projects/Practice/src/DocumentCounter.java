public class DocumentCounter {

    public static class Counter {
        private int count = 0;
        private int increment;

        public Counter(int increment) {
            this.increment = increment;
        }

        public int getAndIncrement() {
            this.count += this.increment;
            return this.count;
        }
    }

    public static class DocumentNameCreator {
        private String prefix;
        private Counter counter;

        public DocumentNameCreator(String prefix, Counter counter) {
            this.prefix = prefix;
            this.counter = counter;
        }
        public String getNewDocumentName() {
            return prefix + counter.getAndIncrement();
        }
    }
}


/*
public class DocumentCounter {

    public static abstract class AbstractDocumentCounter {
        private int count = 0;
        private int increment;

        public AbstractDocumentCounter(int increment) {
            this.increment = increment;
        }

        protected int getAndIncrement() {
            this.count += this.increment;
            return this.count;
        }

        public abstract String getNewDocumentName();
    }

    public static class DocumentNameCreator extends AbstractDocumentCounter {
        private String prefix;

        public DocumentNameCreator(int increment, String prefix) {
            super(increment);
            this.prefix = prefix;
        }

        public String getNewDocumentName() {
            return prefix + getAndIncrement();
        }
    }
}
*/