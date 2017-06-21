import { MyalbumPage } from './app.po';

describe('myalbum App', () => {
  let page: MyalbumPage;

  beforeEach(() => {
    page = new MyalbumPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
