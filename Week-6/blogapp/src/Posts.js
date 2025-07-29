import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  async loadPosts() {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
      }
      const data = await response.json();
      const formattedPosts = data.map(item => new Post(item.id, item.title, item.body));
      this.setState({ posts: formattedPosts, error: null });
    } catch (error) {
      console.error('Error fetching posts:', error);
      this.setState({ error: error.message, posts: [] });
    }
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, errorInfo) {
    console.error("Caught error:", error, errorInfo);
    this.setState({
      error: "An unexpected error occurred while displaying posts.",
      posts: []
    });
    alert(`Error: ${error.message}`);
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return (
        <div style={{ color: 'red', padding: '20px' }}>
          <h2>Error!</h2>
          <p>{error}</p>
        </div>
      );
    }

    if (posts.length === 0) {
      return (
        <div style={{ padding: '20px' }}>
          <h2>Loading Posts...</h2>
        </div>
      );
    }

    return (
      <div style={{ padding: '20px' }}>
        <h1>Latest Blog Posts</h1>
        {posts.map(post => (
          <div key={post.id} style={{
            border: '1px solid #ddd',
            borderRadius: '6px',
            padding: '15px',
            marginBottom: '15px',
            backgroundColor: '#fff'
          }}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
