package com.pautorrents.designpatterns.patterns.bridge;

import com.pautorrents.designpatterns.helpers.OutputWriter;
import com.pautorrents.designpatterns.patterns.IPatternManager;
import com.pautorrents.designpatterns.patterns.bridge.pattern.views.View;
import com.pautorrents.designpatterns.patterns.bridge.entities.Author;
import com.pautorrents.designpatterns.patterns.bridge.entities.Book;
import com.pautorrents.designpatterns.patterns.bridge.entities.IEntity;
import com.pautorrents.designpatterns.patterns.bridge.pattern.resources.AuthorResource;
import com.pautorrents.designpatterns.patterns.bridge.pattern.resources.BookResource;
import com.pautorrents.designpatterns.patterns.bridge.pattern.resources.IMediaResource;
import com.pautorrents.designpatterns.patterns.bridge.pattern.views.LongDetailView;
import com.pautorrents.designpatterns.patterns.bridge.pattern.views.RowView;
import com.pautorrents.designpatterns.patterns.bridge.pattern.views.ShortDetailView;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BridgePatternManager implements IPatternManager {

    private OutputWriter outputWriter = new OutputWriter();

    @Override
    public void execute() {
        List<IEntity> entities = this.getEntities();

        this.renderALongDetailedBook(entities);
        this.renderALongDetailedAuthor(entities);
        this.renderAShortDetailedBook(entities);
        this.renderAShortDetailedAuthor(entities);
        this.renderBooksList(entities);
        this.renderAuthorsList(entities);
    }

    private void renderALongDetailedBook(List<IEntity> entities) {
        Optional<IEntity> entity = entities.stream()
                                 .filter(x -> x.getClass() == Book.class)
                                 .findFirst();

        if (entity.isPresent()) {
            IMediaResource resource = this.convert((Book) entity.get());
            View view = new LongDetailView(resource);
            this.outputWriter.printLn(view.show());
        } else {
            this.outputWriter.printLn("[ ERROR ]: Error getting a book.");
        }
    }

    private void renderALongDetailedAuthor(List<IEntity> entities) {
        Optional<IEntity> entity = entities.stream()
                .filter(x -> x.getClass() == Author.class)
                .findFirst();

        if (entity.isPresent()) {
            IMediaResource resource = this.convert((Author) entity.get());
            View view = new LongDetailView(resource);
            this.outputWriter.printLn(view.show());
        } else {
            this.outputWriter.printLn("[ ERROR ]: Error getting an author.");
        }
    }

    private void renderAShortDetailedBook(List<IEntity> entities) {
        Optional<IEntity> entity = entities.stream()
                .filter(x -> x.getClass() == Book.class)
                .findFirst();

        if (entity.isPresent()) {
            IMediaResource resource = this.convert((Book) entity.get());
            View view = new ShortDetailView(resource);
            this.outputWriter.printLn(view.show());
        } else {
            this.outputWriter.printLn("[ ERROR ]: Error getting a book.");
        }
    }

    private void renderAShortDetailedAuthor(List<IEntity> entities) {
        Optional<IEntity> entity = entities.stream()
                .filter(x -> x.getClass() == Author.class)
                .findFirst();

        if (entity.isPresent()) {
            IMediaResource resource = this.convert((Author) entity.get());
            View view = new ShortDetailView(resource);
            this.outputWriter.printLn(view.show());
        } else {
            this.outputWriter.printLn("[ ERROR ]: Error getting an author.");
        }
    }

    private void renderBooksList(List<IEntity> entities) {
        List<View> books = entities.stream()
                .filter(x -> x.getClass() == Book.class)
                .map(x -> this.convert((Book) x))
                .map(RowView::new)
                .collect(Collectors.toList());

        this.outputWriter.printLn("BOOKS:\n");
        for (View view : books) {
            this.outputWriter.printLn(view.show());
        }
        this.outputWriter.printLn("\n");
    }

    private void renderAuthorsList(List<IEntity> entities) {
        List<View> authors = entities.stream()
                .filter(x -> x.getClass() == Author.class)
                .map(x -> this.convert((Author) x))
                .map(RowView::new)
                .collect(Collectors.toList());

        this.outputWriter.printLn("AUTHORS:\n");
        for (View view : authors) {
            this.outputWriter.printLn(view.show());
        }
        this.outputWriter.printLn("\n");
    }

    private List<IEntity> getEntities() {
        return Arrays.asList(
            new Author("Martin DP Fowler", "24/04/1963", this.insertPeriodically("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi est nisl, mollis et facilisis ac, consequat eu nisl. Nunc eleifend nibh tellus, et molestie metus ornare eget. Nullam convallis risus vitae volutpat fringilla. Suspendisse feugiat enim at euismod lacinia. Duis interdum, justo ac euismod consectetur, risus turpis pharetra purus, eget pretium tellus eros eu odio. Sed vitae urna pretium, euismod justo ac, molestie nunc. Mauris egestas consectetur quam, ac hendrerit est blandit ac. Suspendisse tellus dolor, laoreet in semper eu, molestie ac erat. Curabitur facilisis elit id gravida blandit. Nunc vulputate tortor arcu, ut sagittis mi aliquam et. Etiam pulvinar, urna ut placerat varius, lacus nisl elementum sem, ut rutrum ligula lacus sed purus. Fusce id mollis libero. Quisque nec tortor iaculis, lobortis justo vel, sodales nunc. Sed lectus odio, pellentesque nec efficitur id, ultricies a nulla. Vivamus tristique sapien in lectus blandit pulvinar.",
                    "\n", 100
                ) + "\n\n"
                + this.insertPeriodically("Fusce faucibus dictum ante quis luctus. Mauris id porta neque. Mauris sed nulla ex. Donec consectetur dolor eget turpis ultrices, porta condimentum dui lobortis. Phasellus eleifend pretium ipsum eget cursus. Nunc convallis urna ac tellus pulvinar malesuada ac nec ex. Nulla facilisi.",
                    "\n", 100
                )
            ),
            new Author("Robert C. Martin", "10/08/1952", this.insertPeriodically("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi est nisl, mollis et facilisis ac, consequat eu nisl. Nunc eleifend nibh tellus, et molestie metus ornare eget. Nullam convallis risus vitae volutpat fringilla. Suspendisse feugiat enim at euismod lacinia. Duis interdum, justo ac euismod consectetur, risus turpis pharetra purus, eget pretium tellus eros eu odio. Sed vitae urna pretium, euismod justo ac, molestie nunc. Mauris egestas consectetur quam, ac hendrerit est blandit ac. Suspendisse tellus dolor, laoreet in semper eu, molestie ac erat. Curabitur facilisis elit id gravida blandit. Nunc vulputate tortor arcu, ut sagittis mi aliquam et. Etiam pulvinar, urna ut placerat varius, lacus nisl elementum sem, ut rutrum ligula lacus sed purus. Fusce id mollis libero. Quisque nec tortor iaculis, lobortis justo vel, sodales nunc. Sed lectus odio, pellentesque nec efficitur id, ultricies a nulla. Vivamus tristique sapien in lectus blandit pulvinar.",
                        "\n", 100
                ) + "\n\n"
                + this.insertPeriodically("Fusce faucibus dictum ante quis luctus. Mauris id porta neque. Mauris sed nulla ex. Donec consectetur dolor eget turpis ultrices, porta condimentum dui lobortis. Phasellus eleifend pretium ipsum eget cursus. Nunc convallis urna ac tellus pulvinar malesuada ac nec ex. Nulla facilisi.",
                    "\n", 100
                )
            ),
            new Author("Eric Freeman", "24/04/1971", this.insertPeriodically("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi est nisl, mollis et facilisis ac, consequat eu nisl. Nunc eleifend nibh tellus, et molestie metus ornare eget. Nullam convallis risus vitae volutpat fringilla. Suspendisse feugiat enim at euismod lacinia. Duis interdum, justo ac euismod consectetur, risus turpis pharetra purus, eget pretium tellus eros eu odio. Sed vitae urna pretium, euismod justo ac, molestie nunc. Mauris egestas consectetur quam, ac hendrerit est blandit ac. Suspendisse tellus dolor, laoreet in semper eu, molestie ac erat. Curabitur facilisis elit id gravida blandit. Nunc vulputate tortor arcu, ut sagittis mi aliquam et. Etiam pulvinar, urna ut placerat varius, lacus nisl elementum sem, ut rutrum ligula lacus sed purus. Fusce id mollis libero. Quisque nec tortor iaculis, lobortis justo vel, sodales nunc. Sed lectus odio, pellentesque nec efficitur id, ultricies a nulla. Vivamus tristique sapien in lectus blandit pulvinar.",
                        "\n", 100
                ) + "\n\n"
                + this.insertPeriodically("Fusce faucibus dictum ante quis luctus. Mauris id porta neque. Mauris sed nulla ex. Donec consectetur dolor eget turpis ultrices, porta condimentum dui lobortis. Phasellus eleifend pretium ipsum eget cursus. Nunc convallis urna ac tellus pulvinar malesuada ac nec ex. Nulla facilisi.",
                    "\n", 100
                )
            ),
            new Book("Refactoring", "Martin DP Fowler", "19/07/1999", this.insertPeriodically("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi est nisl, mollis et facilisis ac, consequat eu nisl. Nunc eleifend nibh tellus, et molestie metus ornare eget. Nullam convallis risus vitae volutpat fringilla. Suspendisse feugiat enim at euismod lacinia. Duis interdum, justo ac euismod consectetur, risus turpis pharetra purus, eget pretium tellus eros eu odio. Sed vitae urna pretium, euismod justo ac, molestie nunc. Mauris egestas consectetur quam, ac hendrerit est blandit ac. Suspendisse tellus dolor, laoreet in semper eu, molestie ac erat. Curabitur facilisis elit id gravida blandit. Nunc vulputate tortor arcu, ut sagittis mi aliquam et. Etiam pulvinar, urna ut placerat varius, lacus nisl elementum sem, ut rutrum ligula lacus sed purus. Fusce id mollis libero. Quisque nec tortor iaculis, lobortis justo vel, sodales nunc. Sed lectus odio, pellentesque nec efficitur id, ultricies a nulla. Vivamus tristique sapien in lectus blandit pulvinar.",
                        "\n", 100
                ) + "\n\n"
                + this.insertPeriodically("Fusce faucibus dictum ante quis luctus. Mauris id porta neque. Mauris sed nulla ex. Donec consectetur dolor eget turpis ultrices, porta condimentum dui lobortis. Phasellus eleifend pretium ipsum eget cursus. Nunc convallis urna ac tellus pulvinar malesuada ac nec ex. Nulla facilisi.",
                    "\n", 100
                )
            ),
            new Book("Clean Code", "Robert C. Martin", "01/12/2001", this.insertPeriodically("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi est nisl, mollis et facilisis ac, consequat eu nisl. Nunc eleifend nibh tellus, et molestie metus ornare eget. Nullam convallis risus vitae volutpat fringilla. Suspendisse feugiat enim at euismod lacinia. Duis interdum, justo ac euismod consectetur, risus turpis pharetra purus, eget pretium tellus eros eu odio. Sed vitae urna pretium, euismod justo ac, molestie nunc. Mauris egestas consectetur quam, ac hendrerit est blandit ac. Suspendisse tellus dolor, laoreet in semper eu, molestie ac erat. Curabitur facilisis elit id gravida blandit. Nunc vulputate tortor arcu, ut sagittis mi aliquam et. Etiam pulvinar, urna ut placerat varius, lacus nisl elementum sem, ut rutrum ligula lacus sed purus. Fusce id mollis libero. Quisque nec tortor iaculis, lobortis justo vel, sodales nunc. Sed lectus odio, pellentesque nec efficitur id, ultricies a nulla. Vivamus tristique sapien in lectus blandit pulvinar.",
                        "\n", 100
                ) + "\n\n"
                + this.insertPeriodically("Fusce faucibus dictum ante quis luctus. Mauris id porta neque. Mauris sed nulla ex. Donec consectetur dolor eget turpis ultrices, porta condimentum dui lobortis. Phasellus eleifend pretium ipsum eget cursus. Nunc convallis urna ac tellus pulvinar malesuada ac nec ex. Nulla facilisi.",
                    "\n", 100
                )
            ),
            new Book("Head First Design Patterns", "Eric Freeman", "19/07/2002", this.insertPeriodically("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi est nisl, mollis et facilisis ac, consequat eu nisl. Nunc eleifend nibh tellus, et molestie metus ornare eget. Nullam convallis risus vitae volutpat fringilla. Suspendisse feugiat enim at euismod lacinia. Duis interdum, justo ac euismod consectetur, risus turpis pharetra purus, eget pretium tellus eros eu odio. Sed vitae urna pretium, euismod justo ac, molestie nunc. Mauris egestas consectetur quam, ac hendrerit est blandit ac. Suspendisse tellus dolor, laoreet in semper eu, molestie ac erat. Curabitur facilisis elit id gravida blandit. Nunc vulputate tortor arcu, ut sagittis mi aliquam et. Etiam pulvinar, urna ut placerat varius, lacus nisl elementum sem, ut rutrum ligula lacus sed purus. Fusce id mollis libero. Quisque nec tortor iaculis, lobortis justo vel, sodales nunc. Sed lectus odio, pellentesque nec efficitur id, ultricies a nulla. Vivamus tristique sapien in lectus blandit pulvinar.",
                    "\n", 100
                ) + "\n\n"
                + this.insertPeriodically("Fusce faucibus dictum ante quis luctus. Mauris id porta neque. Mauris sed nulla ex. Donec consectetur dolor eget turpis ultrices, porta condimentum dui lobortis. Phasellus eleifend pretium ipsum eget cursus. Nunc convallis urna ac tellus pulvinar malesuada ac nec ex. Nulla facilisi.",
                    "\n", 100
                )
            )
        );
    }

    public String insertPeriodically(
            String text, String insert, int period)
    {
        StringBuilder builder = new StringBuilder(
                text.length() + insert.length() * (text.length()/period)+1);

        int index = 0;
        String prefix = "";
        while (index < text.length())
        {
            builder.append(prefix);
            prefix = insert;
            builder.append(text.substring(index,
                    Math.min(index + period, text.length())));
            index += period;
        }
        return builder.toString();
    }

    private BookResource convert(Book book) {
        return new BookResource(book);
    }

    private AuthorResource convert(Author author) {
        return new AuthorResource(author);
    }
}
